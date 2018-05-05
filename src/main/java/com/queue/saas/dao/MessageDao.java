package com.queue.saas.dao;

import com.queue.saas.entity.MessageEntity;

public interface MessageDao {
	public void saveMessage(MessageEntity message);
	public MessageEntity find(String userName);
}
