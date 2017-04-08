package com.example;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.stereotype.Component;

@Component
public class MyCustomSecurityListener implements ApplicationListener<AbstractAuthenticationFailureEvent>{

	@Override
	public void onApplicationEvent(AbstractAuthenticationFailureEvent event) {

		System.out.println(" Authentication Failure "+event.getException().getMessage());
	}

}
