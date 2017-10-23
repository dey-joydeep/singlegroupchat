package com.jd.gca.process;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.jd.gca.beans.RecieverInfoBean;
import com.jd.gca.db.entity.table.EmojiEntity;
import com.jd.gca.db.entity.view.MessageInfoView;
import com.jd.gca.db.entity.view.UserInfoView;
import com.jd.gca.db.service.EmojiService;
import com.jd.gca.db.service.EmojiServiceImpl;
import com.jd.gca.db.service.MessageInfoService;
import com.jd.gca.db.service.MessageInfoServiceImpl;
import com.jd.gca.db.service.UserInfoService;
import com.jd.gca.db.service.UserInfoServiceImpl;
import com.jd.gca.resources.Commons;
import com.jd.gca.resources.GlobalResources;

/**
 * Handle tasks, associated with GET requests
 *
 * @author Joydeep Dey
 *
 */
public class GetRequestProcessor {

	/**
	 * Load the friend list
	 * 
	 * @param loginId
	 * @return
	 */
	public String getAllFriends(long loginId) {

		UserInfoService service = new UserInfoServiceImpl();
		List<UserInfoView> friendList = service.getFriendList(loginId);

		try {
			JSONObject object = null;
			JSONArray array = new JSONArray();

			for (UserInfoView userInfo : friendList) {
				object = new JSONObject(userInfo);
				if (GlobalResources.SESSION_HOLDER.containsKey(userInfo.getLoginId()))
					object.put(Commons.JsonKeys.ONLINE, true);
				array.put(object);
			}
			return array.toString();
		} catch (JSONException e) {
			e.printStackTrace();
			return Commons.Response.ERROR;
		}
	}

	/**
	 * Get all previous chats.
	 * 
	 * @return
	 */
	public String getOldChats() {
		String chats = Commons.Response.ERROR;
		MessageInfoService service = new MessageInfoServiceImpl();
		List<MessageInfoView> messages = service.getAllmessages();
		List<RecieverInfoBean> messageBeanList = new ArrayList<>();
		for (MessageInfoView message : messages) {
			RecieverInfoBean recieverInfoBean = new RecieverInfoBean();
			recieverInfoBean.setMessageId(message.getMessageId());
			recieverInfoBean.setSenderName(message.getSenderName());
			recieverInfoBean.setSentTimestamp(CommonProcessor.dateToString(message.getSentAt()));
			recieverInfoBean.setMessage(message.getMessage());
			recieverInfoBean.setLoginId(String.valueOf(message.getSenderId()));
			messageBeanList.add(recieverInfoBean);
		}

		if (!messageBeanList.isEmpty()) {
			JSONArray array = new JSONArray(messageBeanList);
			chats = array.toString();
		}
		return chats;
	}

	/**
	 * Load the emojis.<br>
	 * FIXME: To be modified. Emojis will be categorized in tab, click on that,
	 * emojis will be loaded. Loading emojis might be incremental too, if required.
	 * 
	 * @return All emojis in as JSON
	 * @throws JSONException
	 */
	public String loadEmojis() {
		EmojiService service = new EmojiServiceImpl();
		List<EmojiEntity> emojiList = service.getAllEmoji();
		JSONArray array = new JSONArray();
		try {
			for (EmojiEntity emoji : emojiList) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put(Commons.JsonKeys.Emoji.CODE, emoji.getEmojiCode());
				jsonObject.put(Commons.JsonKeys.Emoji.NAME, emoji.getEmojiName());
				jsonObject.put(Commons.JsonKeys.Emoji.DATA, new String(emoji.getEmojiData(), StandardCharsets.UTF_8));
				array.put(jsonObject);
			}
		} catch (JSONException e) {
			return Commons.Response.ERROR;
		}
		return array.toString();
	}
}
