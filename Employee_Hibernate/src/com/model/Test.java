package com.model;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getseSessionFactory().openSession();
		
		Employee1 e=new Employee1();
		e.setEid(3);
		e.setEname("neha");
	    e.setEaddr("mumbai");
	    session.save(e);
		
		 
		session.beginTransaction().commit();
	
	}

}
