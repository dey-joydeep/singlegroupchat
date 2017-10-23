package com.jd.gca.db.service;

import java.util.List;

import com.jd.gca.db.entity.view.UserInfoView;

public interface UserInfoService {

	UserInfoView getUserInfoByLoginId(long loginId);

	List<UserInfoView> getFriendList(long loginId);

	String getSenderName(long loginId);
}
