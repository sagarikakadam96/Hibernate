package com.lti.HibernateDemoAnnotations;
import javax.persistence.*;
@Entity
@Table(name="emp500")
public class EmployeeAnnotations {
	@Id
	private int id;
	private String fname,lname;
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


