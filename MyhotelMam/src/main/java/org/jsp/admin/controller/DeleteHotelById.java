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

@WebServlet("/deleteh")
public class DeleteHotelById extends HttpServlet {
	private AdminDao adminDao=new AdminDaoImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int Id=Integer.parseInt(req.getParameter("id"));
		
		boolean status=adminDao.deletHotelbyId(Id);
		if(status) {
			req.setAttribute("msg", "hoteldeletedd");
		}else {
			req.setAttribute("msg", "HotekNotDeleted");
		}
		
		RequestDispatcher des=req.getRequestDispatcher("/admin/HotelList.jsp");
		des.forward(req, resp);
		
	}
}
