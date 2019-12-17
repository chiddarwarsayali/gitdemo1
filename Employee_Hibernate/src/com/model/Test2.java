package com.model;

import org.hibernate.Session;

public class Test2 {
public static void main(String[] args) {
	
	Session session=HibernateUtil.getseSessionFactory().openSession();
	
	 Employee1 e=session.get(Employee1.class,2);
	 session.delete(e);
	 session.beginTransaction().commit();
}
}
