package com.jnmd.normal;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/bean.xml");
		UserService userService = context.getBean("userService",UserService.class);
		userService.addUser();
	}

}
