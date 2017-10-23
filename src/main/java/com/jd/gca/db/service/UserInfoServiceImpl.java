package com.jd.gca.db.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jd.gca.db.config.SessionConfig;
import com.jd.gca.db.dao.UserInfoDAO;
import com.jd.gca.db.entity.view.UserInfoView;

public class UserInfoServiceImpl implements UserInfoService {

	@Override
	public UserInfoView getUserInfoByLoginId(long loginId) {
		try (SqlSession sqlSession = SessionConfig.getSession()) {
			UserInfoDAO userInfoDAO = sqlSession.getMapper(UserInfoDAO.class);
			return userInfoDAO.getUserInfo(loginId);
		}
	}

	@Override
	public List<UserInfoView> getFriendList(long loginId) {
		try (SqlSession sqlSession = SessionConfig.getSession()) {
			UserInfoDAO userInfoDAO = sqlSession.getMapper(UserInfoDAO.class);
			return userInfoDAO.getFriendList(loginId);
		}
	}

	@Override
	public String getSenderName(long loginId) {
		try (SqlSession sqlSession = SessionConfig.getSession()) {
			UserInfoDAO userInfoDAO = sqlSession.getMapper(UserInfoDAO.class);
			return userInfoDAO.getSenderName(loginId);
		}
	}
}
