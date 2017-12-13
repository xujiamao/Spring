package com.jnmd.normal;

public class UserService {
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public void addUser() {
		userDAO.addUser();
		System.out.println("service addUser");
	}
	public void updateUser(){
		userDAO.updateUser();
		System.out.println("service updateUser");
	}
}
