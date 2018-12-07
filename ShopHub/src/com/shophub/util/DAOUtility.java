package com.shophub.util;

import com.shophub.dao.IUserDAO;
import com.shophub.dao.UserDAO;

public class DAOUtility {

	public DAOUtility() {
		// TODO Auto-generated constructor stub
	}

	public static IUserDAO getUserDAO(){
		return new UserDAO();
	}
}
