package com.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevConfig implements Config{

	@Bean
	public Configuration getConfig() {
		Configuration configuration=new Configuration();
		configuration.setEnvironment("Dev Environment");
		return configuration;
	}

}
