package com.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QAConfig implements Config{

	@Bean
	public Configuration getConfig() {
		Configuration configuration=new Configuration();
		configuration.setEnvironment("QA Environment");
		return configuration;	
		}

}
