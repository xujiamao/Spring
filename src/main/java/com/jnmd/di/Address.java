package com.jnmd.di;

public class Address {
	private String home;
	private String offi;
	public void setHome(String home) {
		this.home = home;
	}
	public Address() {
	}
	public void setOffi(String offi) {
		this.offi = offi;
	}
	public Address(String home, String offi) {
		super();
		this.home = home;
		this.offi = offi;
	}
	
}
