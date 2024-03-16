package org.jsp.dao;

import java.util.List;

import org.jsp.entity.Admin;
import org.jsp.entity.Hotel;

public interface AdminDao {
	
	Admin login(String email, String pass);
	
	boolean addHotel(Hotel h);
	
	List<Hotel> getAllHotelDetl();
	
	boolean deletHotelbyId(int Id);
	
	Hotel updateHotelDetails(Hotel hotel);
	
	Hotel getHotelById(int id);
}
