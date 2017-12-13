package com.jnmd.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("add")
@Scope("singleton")
public class Address {
	@Value("北京")
	private String home;
	@Value("西小口")
	private String street;
	public String getHome() {
		return home;
	}
	public Address() {
		super();
	}
	public Address(String home, String street) {
		super();
		this.home = home;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [home=" + home + ", street=" + street + "]";
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
