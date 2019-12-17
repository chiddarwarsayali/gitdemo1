package com.model;

import org.hibernate.Session;

public class Test1 {
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getseSessionFactory().openSession();
		
		 Employee1 e=session.get(Employee1.class,2);
		 
		 System.out.println(e.getEid());
		 System.out.println(e.getEname());
		 System.out.println(e.getEname());
		  
	}

}
