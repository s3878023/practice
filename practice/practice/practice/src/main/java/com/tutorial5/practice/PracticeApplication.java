package com.tutorial5.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		
		// For loading beans from the file
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ChatApplication app = context.getBean(ChatApplication.class);
		
		app.getService().send();
	
		
		System.out.println(app.getService());
		
		FacebookService fbService = context.getBean(FacebookService.class);
		System.out.println(fbService);
		fbService.send();
		
		SMSService smsService = context.getBean(SMSService.class);
		app.setService(smsService);
		app.getService().send();
		
		// For loading beans from Annotation
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		ChatApplication app = context.getBean(ChatApplication.class);
//		
//	
//		app.getService().send();
//		
//		System.out.println(app.getService());
//		
//		FacebookService fbService = context.getBean(FacebookService.class);
//		System.out.println(fbService);
//		fbService.send();
//		
//		SMSService smsService = context.getBean(SMSService.class);
//		app.setService(smsService);
//		app.getService().send();
		
//		For testing list (Only Annotation version is implemented)
//		System.out.println(app.getServiceList());
		
	}

}
