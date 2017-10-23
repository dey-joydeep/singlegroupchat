package com.jd.gca.db.service;

import java.util.List;

import com.jd.gca.db.entity.view.MessageInfoView;

public interface MessageInfoService {

	List<MessageInfoView> getAllmessages();

	MessageInfoView getMessageById(long messageId);
}
