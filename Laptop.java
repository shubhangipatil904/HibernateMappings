package com.Mappings.HibernateMappings.Moodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	private Integer lid;
	private String lname;
	public Laptop(Integer lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}
	public Laptop() {
		super();
		
	}
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
