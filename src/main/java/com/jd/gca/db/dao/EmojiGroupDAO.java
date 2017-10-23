package com.jd.gca.db.dao;

import java.util.List;

import com.jd.gca.db.entity.table.EmojiEntity;

public interface EmojiGroupDAO {

	List<EmojiEntity> selectAllEmojiGroup();
}
