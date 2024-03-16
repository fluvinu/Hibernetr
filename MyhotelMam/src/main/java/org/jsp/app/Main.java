package org.jsp.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.entity.Admin;
import org.jsp.entity.BookingDetails;
import org.jsp.entity.Customer;
import org.jsp.entity.Hotel;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory face=Persistence.createEntityManagerFactory("Hotel-maam");
		EntityManager mag =face.createEntityManager();
		EntityTransaction tranc =mag.getTransaction();
		
		
		Admin admin = new Admin();
		admin.setFirstName("ramesh");
		admin.setLastName("kaka");
		admin.setMobile(1234567890);
		admin.setEmail("ramesh@gmail.com");
		admin.setPassword("kaka123");
		
		
		Customer customer=new Customer();
		customer.setFirstName("sam");
		customer.setLastName("jonyy");
		customer.setGender("Male");
		customer.setEmail("sam@gmail.com");
		customer.setPassword("hello");
		
		Hotel hotel1=new Hotel();
		hotel1.setHotelName("ITC");
		hotel1.setMobile(1234567840);
		hotel1.setCity("pune");
		hotel1.setAddress("hadapsar");
		hotel1.setPrice(3000);
		hotel1.setTotalNoOfRoom(40);
		hotel1.setNoOfBookedRoom(1);
		
		BookingDetails bkinDetel=new BookingDetails();
		bkinDetel.setCustomer(customer);
		bkinDetel.setNoOfDyas(3);
		bkinDetel.setHotel(hotel1);
		bkinDetel.setNoOfRoom(1);
		bkinDetel.setTotalPrice(2000);
		bkinDetel.setNpoOfPresion(3);
		
		
//		List<BookingDetails> boodetals=new ArrayList<BookingDetails>();
//		boodetals.add(bkinDetel);
//		hotel1.setBookingDetails(boodetals);
		
		
		tranc.begin();
			mag.persist(admin);
//			mag.persist(customer);
//			mag.persist(hotel1);
			mag.persist(bkinDetel);
		tranc.commit();
		
	}
	
}
