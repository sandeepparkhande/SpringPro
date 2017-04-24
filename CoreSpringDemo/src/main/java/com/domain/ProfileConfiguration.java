package com.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.domain")
@Import(SpringDBConfig.class)
@PropertySource("application.properties")
public class ProfileConfiguration {

}
