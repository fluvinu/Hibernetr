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
import org.jsp.entity.Hotel;

@WebServlet("/addhotel")
public class AddHotel extends HttpServlet{
	
	AdminDao admindao=new AdminDaoImp();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String hName=req.getParameter("hotelname");
		long contact=Long.parseLong(req.getParameter("contact"));
		double price = Double.parseDouble(req.getParameter("price"));
		String Addrss=req.getParameter("address");
		String city=req.getParameter("city");
		int totalnoOfRomm=Integer.parseInt(req.getParameter("totalnoofroom"));
		
		
		// crete a object of hote
		Hotel hotel1=new Hotel();
		hotel1.setAddress(Addrss);
		hotel1.setCity(city);
		hotel1.setHotelName(hName);
		hotel1.setPrice(price);
		hotel1.setTotalNoOfRoom(totalnoOfRomm);
		
		// add hotel
		boolean status=admindao.addHotel(hotel1);
		
//		if(status) {
//			req.setAttribute("msg", "hotelAdded Ssefully !!!!");
//			RequestDispatcher dis=req.getRequestDispatcher("/admin/HotelList.jsp");
//			dis.forward(req, resp);
//		}
		resp.sendRedirect("/MyhotelMam/admin/HotelList.jsp?msg=added");
	}
}
