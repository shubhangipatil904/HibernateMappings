package com.Mappings.HibernateMappings.execution;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Mappings.HibernateMappings.Moodel.Laptop;
import com.Mappings.HibernateMappings.config.HibernateConfig;
import com.Mappings.HibernateMappings.config.Student;
public class Execution {
public static void main(String[] args) {
		
		Laptop lp1=new Laptop();
		lp1.setLid(123);
		lp1.setLname("ASUS");
		Laptop lp2=new Laptop();
		lp2.setLid(124);
		lp2.setLname("HP");
		Laptop lp3=new Laptop();
		lp3.setLid(125);
		lp3.setLname("DELL");
		
		
		Student st1=new Student();
		st1.setSid(101);
		st1.setSname("Shubhangi");
		//st1.setLap(lp1);
		
		Student st2=new Student();
		st2.setSid(102);
		st2.setSname("Vaishnavi");
		//st2.setLap(lp2);
		Student st3=new Student();
		st3.setSid(103);
		st3.setSname("Pallavi");
		//st3.setLap(lp3);
		
		SessionFactory sf=HibernateConfig.method1();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		ses.save(st1);
		ses.save(st2);
		ses.save(st3);
		
		ses.save(lp1);
		ses.save(lp2);
		ses.save(lp3);
		
		tx.commit();
		ses.clear();
		
		sf.close();
		
	}

}


