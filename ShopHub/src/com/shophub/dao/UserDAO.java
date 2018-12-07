package com.shophub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDAO  implements IUserDAO{

	public UserDAO() {
		// TODO Auto-generated constructor stub
	}

	


	@Override
	public void changePassword(String userName, String oldPassword,
			String newPassword) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public boolean checkUser(String email, String password) {
		Connection connection=ConnectionFactory.getConnection();
		try {
			PreparedStatement statement=connection.prepareStatement("select * from users where email=? and password=?");
			statement.setString(1, email);
			statement.setString(2, password);
			ResultSet set=statement.executeQuery();
			while(set.next()){
				if(set.getString("email").equals(email)&& set.getString("password").equals(password)){
					return true;
				}
			}
			//throw new InvalidUserException("Invalid Email or Password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		UserDAO obj=new UserDAO();
		System.out.println(obj.checkUser("birappa@gmail.com", "123456"));
	}
	
}
