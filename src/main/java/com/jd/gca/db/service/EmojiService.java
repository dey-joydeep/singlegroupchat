package com.jd.gca.db.service;

import java.util.List;

import com.jd.gca.db.entity.table.EmojiEntity;

public interface EmojiService {

	void insertEmoji(EmojiEntity entity);

	List<EmojiEntity> getAllEmoji();

	List<EmojiEntity> selectEmojiByGroup(int groupId);
}
