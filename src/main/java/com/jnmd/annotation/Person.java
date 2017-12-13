package com.jnmd.annotation;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.jnmd.annotation.Address;
@Component
public class Person {
	@Value("张三")
	private String name;
	@Value("24")
	private int age;
	@Value("11123123")
	private int phone;
	@Resource(name="add")
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person(String name, int age, int phone,Address address) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
