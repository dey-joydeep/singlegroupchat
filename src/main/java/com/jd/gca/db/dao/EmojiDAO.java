package com.jd.gca.db.dao;

import java.util.List;

import com.jd.gca.db.entity.table.EmojiEntity;

public interface EmojiDAO {

	void insertEmoji(EmojiEntity entity);

	List<EmojiEntity> selectAllEmoji();

	List<EmojiEntity> selectEmojiByGroup(int groupId);
}
