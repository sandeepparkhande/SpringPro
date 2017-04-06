package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Account;
import com.domain.Customer;
import com.domain.Message;

@SpringBootApplication
@ComponentScan("com.domain")
@PropertySource("application.properties")
@RestController
public class CoreSpringRestWebDemoApplication {

	
	@Autowired
	Message msg;
	
	@Autowired
	Customer customer;
	
	@RequestMapping("/message")
	public String getMessage() {
		return msg.getMyMessage();
	}
	
	@RequestMapping("/profile")
	public String getProfileMessage() {
		return msg.getMyMessage();
	}
	
	@RequestMapping("/cust")
	public String getCustomer() {
		return customer.toString();
	}


	public static void main(String[] args) {
		SpringApplication.run(CoreSpringRestWebDemoApplication.class, args);
		//dpendencyInjection(args);
	}

	private static void dependencyInjection(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(CoreSpringRestWebDemoApplication.class, args);
		Account savingAccount=(Account) applicationContext.getBean("savingAccount");
		System.out.println(" Saving Account Balance is "+savingAccount.getBalance());
//		System.out.println(" Saving Account Balance is "+savingAccount.getCustomer().getName());
	}
	
	
}
