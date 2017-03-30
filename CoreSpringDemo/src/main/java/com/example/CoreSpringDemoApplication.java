package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.domain.Account;

@SpringBootApplication
@ComponentScan("com.domain")
public class CoreSpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(CoreSpringDemoApplication.class, args);
		Account savingAccount=(Account) applicationContext.getBean("savingAccount");
		System.out.println(" Saving Account Balance is "+savingAccount.getBalance());
		System.out.println(" Saving Account Balance is "+savingAccount.getCustomer().getName());
		/*Account currentAccount=(Account) applicationContext.getBean("currentAccount");
		System.out.println(" Current Account Balance is "+currentAccount.getBalance());*/
	}
}
