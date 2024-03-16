package org.jsp.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.dao.AdminDao;
import org.jsp.dao.AdminDaoImp;
import org.jsp.entity.Hotel;

@WebServlet("/UpdateHotel")
public class UpdateHotel extends HttpServlet{
	private AdminDao admindao=new AdminDaoImp();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// fect data from jsp
		Hotel hotel=new Hotel();
		hotel.setId(Integer.parseInt(req.getParameter("id")));
		hotel.setHotelName(req.getParameter("hotelNmae"));
		hotel.setMobile(Long.parseLong(req.getParameter("contact")));
		hotel.setPrice(Double.parseDouble(req.getParameter("price")));
		hotel.setCity(req.getParameter("city"));
		hotel.setAddress(req.getParameter("address"));
		hotel.setTotalNoOfRoom(Integer.parseInt(req.getParameter("tnoofRoom")));
		hotel.setNoOfBookedRoom(Integer.parseInt(req.getParameter("bkroom")));
		
		
		// call updatin method 
		Hotel updaHotelDetals=admindao.updateHotelDetails(hotel);
		
		resp.sendRedirect("/MyhotelMam/admin/HotelList.jsp?msg=update");
		
	}

}
