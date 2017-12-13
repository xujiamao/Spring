package com.jnmd.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jnmd.annotation.Person;

public class TestAnnotation {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("/annotation.xml");
		Person p = context.getBean("person", Person.class);
		System.out.println(p);
	}

}
