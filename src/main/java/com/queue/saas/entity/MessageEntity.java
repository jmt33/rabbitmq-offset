package com.queue.saas.entity;

import java.io.Serializable;

public class MessageEntity implements Serializable {
	private Long id;
    private String userName;
    private String passWord;
    private String Node;
    private String Connection;
    private String Virtual_host;
    private String User;
    private Integer Channel;
    private String Exchange;
    private String Routing_keys;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNode() {
		return Node;
	}
	public void setNode(String node) {
		Node = node;
	}
	public String getConnection() {
		return Connection;
	}
	public void setConnection(String connection) {
		Connection = connection;
	}
	public String getVirtual_host() {
		return Virtual_host;
	}
	public void setVirtual_host(String virtual_host) {
		Virtual_host = virtual_host;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public Integer getChannel() {
		return Channel;
	}
	public void setChannel(Integer channel) {
		Channel = channel;
	}
	public String getExchange() {
		return Exchange;
	}
	public void setExchange(String exchange) {
		Exchange = exchange;
	}
	public String getRouting_keys() {
		return Routing_keys;
	}
	public void setRouting_keys(String routing_keys) {
		Routing_keys = routing_keys;
	}
   
}
