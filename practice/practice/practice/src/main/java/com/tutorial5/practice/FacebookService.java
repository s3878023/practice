package com.tutorial5.practice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class FacebookService implements MessageService {

	@Override
	public void send() {
		System.out.println("In FacebookService");		
	}

}
