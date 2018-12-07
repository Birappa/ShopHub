package com.shophub.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shophub.dao.IUserDAO;
import com.shophub.util.DAOUtility;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		boolean isUserExist=false;
		try{
			// isUserExist=checkUserExist(email, password);
			isUserExist=checkUserExist(email, password);
		}catch(RuntimeException re){
			out.print("Invalid UserName or Password");
		}
		if(!isUserExist){
			out.print("Invalid UserName or Password");
		}
		else{
			out.print("Welcome to ShopHub");
		}
	}

	private boolean checkUserExist(String email, String password) {
		IUserDAO userDAO=DAOUtility.getUserDAO();
		return userDAO.checkUser(email, password);
		
	}
}
