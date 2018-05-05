package com.queue.saas.dao.impl;

import com.queue.saas.entity.MessageEntity;
import com.queue.saas.dao.MessageDao;
import com.mongodb.WriteResult;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@Component
public class MessageDaoImpl implements MessageDao {
	
	@Autowired
    private MongoTemplate mongoTemplate;
	
	@Override
	public void saveMessage(MessageEntity message) {
		mongoTemplate.save(message);
	}
	
	@Override
	public MessageEntity find(String userName)
	{
		Query query=new Query(Criteria.where("userName").is(userName));
        MessageEntity user = mongoTemplate.findOne(query , MessageEntity.class);
        return user;
	}
}
