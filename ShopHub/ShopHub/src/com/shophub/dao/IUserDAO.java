package com.shophub.dao;



public interface IUserDAO {

	public boolean checkUser(String email, String password);
	public boolean addUser(String userName, String password, String email, long contact);
	public void changePassword(String userName, String oldPassword, String newPassword);
	//public void removeUser(String userName);
}
