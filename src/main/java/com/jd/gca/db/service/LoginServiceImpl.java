package com.jd.gca.db.service;

import org.apache.ibatis.session.SqlSession;

import com.jd.gca.db.config.SessionConfig;
import com.jd.gca.db.dao.LoginDAO;
import com.jd.gca.db.entity.table.LoginEntity;

public class LoginServiceImpl implements LoginService {

	@Override
	public LoginEntity getAuthenticationData(Object userId) {
		try (SqlSession sqlSession = SessionConfig.getSession()) {
			LoginDAO loginDAO = sqlSession.getMapper(LoginDAO.class);
			return loginDAO.getAuthenticationData(userId);
		}
	}

	@Override
	public void updateLastLogin(long loginId) {
		try (SqlSession sql = SessionConfig.getSession()) {
			LoginDAO loginDAO = sql.getMapper(LoginDAO.class);
			loginDAO.updateLastLogin(loginId);
			sql.commit();
		}
	}

	@Override
	public void updateLastOnline(long loginId) {
		try (SqlSession sql = SessionConfig.getSession()) {
			LoginDAO loginDAO = sql.getMapper(LoginDAO.class);
			loginDAO.updateLastOnline(loginId);
			sql.commit();
		}
	}

}
