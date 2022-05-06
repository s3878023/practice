package com.tutorial5.practice;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class ChatApplication {
	
	//@Autowired
	//@Qualifier("facebookService")
	private MessageService service;

	//@Autowired
	private List<MessageService> serviceList;
		
	
	public ChatApplication() {
		super();
	}

	public ChatApplication(List<MessageService> serviceList) {
		super();
		this.serviceList = serviceList;
	}

	public List<MessageService> getServiceList() {
		return serviceList;
	}

	public void setServiceList(List<MessageService> serviceList) {
		this.serviceList = serviceList;
	}

	public void setService(MessageService service) {
		this.service = service;
	}
	
	public MessageService getService() {
		return service;
	}
	
}
