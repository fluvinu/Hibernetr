package org.jsp.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.dao.AdminDao;
import org.jsp.dao.AdminDaoImp;
import org.jsp.entity.Admin;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet{
	private AdminDao dao= new AdminDaoImp();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// fetch data from jsp filw 
		String emailId=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		Admin admin=dao.login(emailId, pass);
		
		if(admin!=null) {
			String fullname=admin.getFirstName()+" "+admin.getLastName();
			req.setAttribute("fullname", fullname);
			RequestDispatcher dispaccher=req.getRequestDispatcher("/admin/home.jsp");
			dispaccher.forward(req, resp);
		}
		else {
			req.setAttribute("msg", "please enter  a valid email and apasss");
			RequestDispatcher dis=req.getRequestDispatcher("/admin/Login.jsp");
			dis.forward(req, resp);
		}
	}
}
