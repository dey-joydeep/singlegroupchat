package com.jd.gca.db.service;

import java.util.List;

import com.jd.gca.db.entity.table.EmojiEntity;

public interface EmojiGroupService {

	List<EmojiEntity> selectAllEmojiGroup();
}
