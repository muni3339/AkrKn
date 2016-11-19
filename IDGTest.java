package com.aid.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.aid.entities.Agent;
import com.aid.util.HibernateUtil;

public class IDGTest {

	public static void main(String[] args) {
		SessionFactory sfactory = null;
		Session session = null;
		Agent agent2 = null;
		sfactory = HibernateUtil.getSessionFactory();
		session  = sfactory.openSession();

		
		session.beginTransaction();
		for(int i=0 ;i<1;i++){
			agent2 = new Agent();
			agent2.setFirstName("muni"+i);
			agent2.setLastName("m g"+i);
			agent2.setDob(new Date());
			agent2.setMobileNo("25489999"+i);
			agent2.setEmailID("fahdf"+i+"@mail.com");
			//session.clear();
			session.save(agent2);
			
		}
		session.getTransaction().commit();
		
		HibernateUtil.closeSessionFactory();

	}

}
