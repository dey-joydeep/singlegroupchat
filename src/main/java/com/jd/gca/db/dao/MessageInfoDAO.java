package com.jd.gca.db.dao;

import java.util.List;

import com.jd.gca.db.entity.view.MessageInfoView;

public interface MessageInfoDAO {

	List<MessageInfoView> selectAllmessages();

	MessageInfoView selectMessageById(long messageId);
}
