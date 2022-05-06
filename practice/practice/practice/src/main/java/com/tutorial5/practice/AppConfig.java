package com.tutorial5.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	public ChatApplication chatApplication() {
		// set up ChatApplication bean with an arrayList
		return new ChatApplication(new ArrayList<>(Arrays.asList(new FacebookService(), new FacebookService(),
							 new SMSService(), new HangoutService())));
		// set up ChatApplication bean with no List dependency injected
		//return new ChatApplication();
	}
	
	
	@Bean
	public List<MessageService> serviceList(){
		return Arrays.asList(new FacebookService(), new FacebookService(),
							 new SMSService(), new HangoutService());
	}
	
	@Bean
	@Scope("prototype")
	public FacebookService facebookService() {
		return new FacebookService();
	}
	
	@Bean
	public HangoutService hangoutService() {
		return new HangoutService();
	}
	
	@Bean
	public SMSService smsService() {
		return new SMSService();
	}
}
