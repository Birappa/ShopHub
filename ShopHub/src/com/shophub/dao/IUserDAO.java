package com.shophub.dao;



public interface IUserDAO {

	public boolean checkUser(String email, String password);
	//public void addUser(User user);
	public void changePassword(String userName, String oldPassword, String newPassword);
	//public void removeUser(String userName);
}
