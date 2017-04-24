package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.domain.Config;
import com.domain.ConfigImpl;
import com.domain.ProfileConfiguration;
import com.domain.SpringDBConfig;

public class SpringProfileLoader {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProfileConfiguration.class);
		ConfigImpl configImpl = annotationConfigApplicationContext.getBean(ConfigImpl.class);
		Config config = configImpl.getConfig();
		System.out.println(" Environment " + config.getConfig().getEnvironment());
		annotationConfigApplicationContext.close();

	}
}
