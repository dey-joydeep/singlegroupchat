package com.jd.gca.db.dao;

import java.util.List;

import com.jd.gca.db.entity.view.UserInfoView;

public interface UserInfoDAO {

	public UserInfoView getUserInfo(long loginId);

	public List<UserInfoView> getFriendList(long loginId);

	public String getSenderName(long loginId);
}
