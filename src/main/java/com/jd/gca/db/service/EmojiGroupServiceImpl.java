package com.jd.gca.db.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jd.gca.db.config.SessionConfig;
import com.jd.gca.db.dao.EmojiGroupDAO;
import com.jd.gca.db.entity.table.EmojiEntity;

public class EmojiGroupServiceImpl implements EmojiGroupService {

	@Override
	public List<EmojiEntity> selectAllEmojiGroup() {
		try (SqlSession sqlSession = SessionConfig.getSession()) {
			EmojiGroupDAO emojiGroupDAO = sqlSession.getMapper(EmojiGroupDAO.class);
			return emojiGroupDAO.selectAllEmojiGroup();
		}
	}
}
