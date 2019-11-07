package com.lti.HibernateDemo;

//persistance(reusable-available all the time) class (pojo class-plain old java obj)
public class Employee {
	// these will be the table fields in sql without writing query
	private int id;
	private String fname, lname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
