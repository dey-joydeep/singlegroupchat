package com.jd.gca.db.service;

import org.apache.ibatis.session.SqlSession;

import com.jd.gca.db.config.SessionConfig;
import com.jd.gca.db.dao.MessageDAO;
import com.jd.gca.db.entity.table.MessageEntity;

public class MessageServiceImpl implements MessageService {

	@Override
	public void insertMessage(MessageEntity entity) {
		try (SqlSession sqlSession = SessionConfig.getSession()) {
			MessageDAO messageDAO = sqlSession.getMapper(MessageDAO.class);
			messageDAO.insertMessage(entity);
			sqlSession.commit();
		}
	}
}
