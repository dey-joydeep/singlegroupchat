package com.jd.gca.db.service;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.jd.gca.db.config.SessionConfig;
import com.jd.gca.db.dao.LoginSessionDAO;
import com.jd.gca.db.entity.table.LoginSessionEntity;

public class LoginSessionServiceImpl implements LoginSessionService {

	@Override
	public Date verifyLoginSessionAndGetExpiryDate(LoginSessionEntity entity) {
		try (SqlSession sqlSession = SessionConfig.getSession()) {
			LoginSessionDAO loginSessionDAO = sqlSession.getMapper(LoginSessionDAO.class);
			return loginSessionDAO.verifyLoginSessionAndGetExpiryDate(entity);
		}
	}

	@Override
	public void deleteLoginSession(LoginSessionEntity entity) {
		try (SqlSession sqlSession = SessionConfig.getSession()) {
			LoginSessionDAO loginSessionDAO = sqlSession.getMapper(LoginSessionDAO.class);
			loginSessionDAO.deleteLoginSession(entity);
			sqlSession.commit();
		}
	}

	@Override
	public void insertLoginSession(LoginSessionEntity entity) {
		try (SqlSession sqlSession = SessionConfig.getSession()) {
			LoginSessionDAO loginSessionDAO = sqlSession.getMapper(LoginSessionDAO.class);
			loginSessionDAO.insertLoginSession(entity);
			sqlSession.commit();
		}
	}
}
