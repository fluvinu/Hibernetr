package org.jsp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Cacheable
public class BookingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bookingid")
	@SequenceGenerator(name="bookingid",sequenceName = "bookingIdSeq",initialValue = 1001,allocationSize = 2)
	private int bookingId;
	
	//tpo save extat time
	@CreationTimestamp
	@Column(name="booking_date_time")
	private LocalDateTime bookingdateTime;
	
	@Column(name="no_of_days")
	private int noOfDyas;
	
	@Column(name="no_oF_persion")
	private int npoOfPresion;
	
	@Column(name="no_of_room")
	private int noOfRoom;
	
	@Column(name="total_price")
	private double totalPrice;
	
	@Column(name="start_date")
	private LocalDate satrtDate;
	
	@Column(name ="end_date")
	private LocalDate endDate;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="hotel_id")
	private Hotel hotel;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDateTime getBookingdateTime() {
		return bookingdateTime;
	}

	public void setBookingdateTime(LocalDateTime bookingdateTime) {
		this.bookingdateTime = bookingdateTime;
	}

	public int getNoOfDyas() {
		return noOfDyas;
	}

	public void setNoOfDyas(int noOfDyas) {
		this.noOfDyas = noOfDyas;
	}

	public int getNpoOfPresion() {
		return npoOfPresion;
	}

	public void setNpoOfPresion(int npoOfPresion) {
		this.npoOfPresion = npoOfPresion;
	}

	public int getNoOfRoom() {
		return noOfRoom;
	}

	public void setNoOfRoom(int noOfRoom) {
		this.noOfRoom = noOfRoom;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public LocalDate getSatrtDate() {
		return satrtDate;
	}

	public void setSatrtDate(LocalDate satrtDate) {
		this.satrtDate = satrtDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	
	
}
