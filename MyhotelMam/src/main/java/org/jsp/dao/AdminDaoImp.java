package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.entity.Admin;
import org.jsp.entity.Hotel;

public class AdminDaoImp implements AdminDao{
	EntityManagerFactory fac= Persistence.createEntityManagerFactory("Hotel-maam");
	EntityManager mag= fac.createEntityManager();
	EntityTransaction tranc= null;

	public Admin login(String email, String pass) {
		String jpqlQ="select a from Admin a where a.email=?1 and a.password=?2";
		
		Query queary=mag.createQuery(jpqlQ);
		queary.setParameter(1, email);
		queary.setParameter(2, pass);
		try {
			Admin admin =(Admin) queary.getSingleResult();
			return admin;
		}catch (Exception e) {
			return null;
		}
		
		
	}

	public boolean addHotel(Hotel h) {
		tranc=mag.getTransaction();
		tranc.begin();
		mag.persist(h);
		tranc.commit();
		return true;
	}

	public List<Hotel> getAllHotelDetl() {
		String jpql="SELECT h FROM Hotel h";
		Query qury= mag.createQuery(jpql);
		List<Hotel> hotels= qury.getResultList();
		return hotels;
	}

	public boolean deletHotelbyId(int Id) {
		tranc=mag.getTransaction();
		tranc.begin();
		Hotel hotel=mag.find(Hotel.class, Id);
		if(hotel!=null) {
			mag.remove(hotel);
			tranc.commit();
			return true;
		}
		return false;
	}

	public Hotel updateHotelDetails(Hotel hotel) {
		tranc=mag.getTransaction();
		Hotel hotelFormDb=	mag.find(Hotel.class, hotel.getId());
		if(hotelFormDb!=null) {
			hotelFormDb.setHotelName(hotel.getHotelName());
			hotelFormDb.setMobile(hotel.getMobile());
			hotelFormDb.setAddress(hotel.getAddress());
			hotelFormDb.setCity(hotel.getCity());
			hotelFormDb.setNoOfBookedRoom(hotel.getNoOfBookedRoom());
			hotelFormDb.setTotalNoOfRoom(hotel.getTotalNoOfRoom());
			hotelFormDb.setPrice(hotel.getPrice());
			
			
			tranc.begin();
			Hotel updatHotel=mag.merge(hotelFormDb);
			tranc.commit();
			return updatHotel;
		}
		
		return null;
	}

	public Hotel getHotelById(int id) {
		Hotel hotelis=mag.find(Hotel.class, id);
		if(hotelis!=null) {
			return hotelis;
		}else {
			return null;
		}
	}

}
