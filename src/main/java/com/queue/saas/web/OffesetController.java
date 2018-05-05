package com.queue.saas.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.queue.saas.dao.impl.MessageDaoImpl;
import com.queue.saas.entity.MessageEntity;
import com.queue.saas.dao.MessageDao;

@RestController
public class OffesetController {
	
	@Autowired
    private MessageDao MessageDao;
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    
    @RequestMapping("/message/list")
    public MessageEntity list() {
    		MessageEntity message = MessageDao.find("小明");
    		return message;
//    		System.out.println(message);
//        return "test";
    }
    
    @RequestMapping("/message/save")
    public String save() {
    		MessageEntity message = new MessageEntity();
    		message.setId(2l);
    		message.setUserName("小明");
    		message.setPassWord("fffooo123");
    		message.setNode("node1");
    		message.setConnection("192.168.0.31");
    		message.setVirtual_host("/");
    		message.setUser("mtao");
    		message.setChannel(12);
    		message.setExchange("fffooo123");
    		message.setRouting_keys("fffooo123");
    		message.setExchange("fffooo123");
    		MessageDao.saveMessage(message);
    		return "ok";
    }
}
