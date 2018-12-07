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
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
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
		String userName=request.getParameter("userName");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		long contact=Long.parseLong(request.getParameter("contact"));
		
		boolean isUserExist=false;
		try{
			// isUserExist=checkUserExist(email, password);
			isUserExist=addUser(userName, password, email, contact);
		}catch(RuntimeException re){
			out.print("Already User Exist");
		}
		if(!isUserExist){
			request.setAttribute("alreadyUser", "Already User Exist");
			request.getRequestDispatcher("register.jsp").forward(request, response);;
			//out.print("Already User Exist");
		}
		else{
			out.print("Welcome to ShopHub");
		}
	}

	public boolean addUser(String userName, String password, String email,
			long contact) {
		IUserDAO userDAO=DAOUtility.getUserDAO();
		return userDAO.addUser(userName, password, email, contact);
	}
}
