package com.domain;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String name="Sandeep";
	private String city="Pune";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
