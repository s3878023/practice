package com.tutorial5.practice;

import org.springframework.stereotype.Component;

//@Component
public class SMSService implements MessageService {

	@Override
	public void send() {
		System.out.println("In SMSService");	
	}

}
