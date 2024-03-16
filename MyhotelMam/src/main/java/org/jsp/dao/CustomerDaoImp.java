package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.entity.Customer;

public class CustomerDaoImp implements CustomerDao{
	EntityManagerFactory fac= Persistence.createEntityManagerFactory("Hotel-maam");
	EntityManager mag= fac.createEntityManager();
	EntityTransaction tranc= null;
	
	
	public void registration(Customer customer) {
		tranc=mag.getTransaction();
		tranc.begin();
		mag.persist(customer);
		tranc.commit();
	}

}
