package com.jpaexample.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String fullname;
	private String contactnumber;
	private String emailaddress;
	private String address;
	private String gender;
	
	@Override
	public String toString(){
		return "name=" + fullname + ",contactnumber= "+contactnumber + ",emailaddress= "+emailaddress+",address= "+address+",gender= "+gender;  
	}
	
	public User(){}
	
	public User(String fullname, String contactnumber, String emailaddress, String address, String gender) {
		super();
		this.fullname = fullname;
		this.contactnumber = contactnumber;
		this.emailaddress = emailaddress;
		this.address = address;
		this.gender = gender;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
