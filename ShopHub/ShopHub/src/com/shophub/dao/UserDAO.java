package com.shophub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDAO  implements IUserDAO{

	Connection connection=null;
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
		 connection=ConnectionFactory.getConnection();
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
		System.out.println(obj.addUser("Birappa","123456","birappa@gmail.com", 1234567890));
	}




	@Override
	public boolean addUser(String userName, String password, String email,
			long contact) {
		 connection=ConnectionFactory.getConnection();
		
		 try {
				PreparedStatement statement=connection.
						prepareStatement("insert into users(userId,userName,password,email,contact) values(uid_seq.nextval,?,?,?,?)");
				
				statement.setString(1, userName);
				statement.setString(2, password);
				statement.setString(3, email);
				statement.setLong(4,contact);
				
				int result=statement.executeUpdate();
				
				if(result==1)
					return true;
				//throw new InvalidUserException("Invalid Email or Password");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return false;
	}
	
	
}
