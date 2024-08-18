package com.Mappings.HibernateMappings.config;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer sid;
	private String sname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	


}
