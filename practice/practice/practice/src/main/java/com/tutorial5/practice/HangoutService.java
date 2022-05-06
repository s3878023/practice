package com.tutorial5.practice;

import org.springframework.stereotype.Component;

//@Component
public class HangoutService implements MessageService{

	@Override
	public void send() {
		System.out.println("In HangoutService");	
		
	}

}
