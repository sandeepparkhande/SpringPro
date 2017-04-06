package com.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfiguration {

	@Bean
	@Profile("dev")
	public Message getMessage(@Value("${msg}") String msg){
		Message message=new Message();
		message.setMyMessage(msg);
		return message;
	}
	
	@Bean
	@Profile("prod")
	public Message getMessageProd(){
		Message message=new Message();
		message.setMyMessage(" This is Prod Profile");
		return message;
	}
	
}
