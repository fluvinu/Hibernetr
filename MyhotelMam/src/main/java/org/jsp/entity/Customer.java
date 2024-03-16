package org.jsp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerId")
	@SequenceGenerator(name = "customerId", sequenceName = "customerIdsequence", initialValue = 101, allocationSize = 3)
	private int id;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email_id", unique = true, nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(length = 10)
	private String gender;
	@OneToMany(mappedBy = "customer")
	private List<BookingDetails> bookingDetitals;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<BookingDetails> getBookingDetitals() {
		return bookingDetitals;
	}

	public void setBookingDetitals(List<BookingDetails> bookingDetitals) {
		this.bookingDetitals = bookingDetitals;
	}

}
