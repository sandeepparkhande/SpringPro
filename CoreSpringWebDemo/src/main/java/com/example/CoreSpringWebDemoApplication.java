package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ServletComponentScan
public class CoreSpringWebDemoApplication {

	@RequestMapping("/must")
	public String mustache(Model model) {
		model.addAttribute("msg", "View and Model");
		return "mustache";
	}

	@RequestMapping("/view")
	public String viewResolver() {
		return "viewresolver";
	}

	@ResponseBody
	@RequestMapping("/product")
	public Product product() {
		return new Product("Apple Watch", "1", 25.12);
	}

	public static void main(String[] args) {
		SpringApplication.run(CoreSpringWebDemoApplication.class, args);
	}
}
