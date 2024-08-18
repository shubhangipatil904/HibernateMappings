package com.Mappings.HibernateMappings.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.Mappings.HibernateMappings.Moodel.Laptop;


public class HibernateConfig {
	
private static SessionFactory sf;
	
	public static SessionFactory method1() {
		if(sf==null) {
			Configuration cfg=new Configuration();
			
			Properties p=new Properties();
			p.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			p.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/hibernatedb");
			p.setProperty(Environment.USER, "root");
			p.setProperty(Environment.PASS, "MCA_49");
			p.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			p.setProperty(Environment.HBM2DDL_AUTO, "create");
			p.setProperty(Environment.SHOW_SQL, "true");
			
			cfg.setProperties(p).addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
			//cfg.setProperties(p).addAnnotatedClass(Laptop.class);
			
			ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
			
			sf=cfg.buildSessionFactory(sr);
			//sf=cfg.buildSessionFactory();
			
		}
		
		return sf;
	}

}
