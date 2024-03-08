package com.entities;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class User {
	
	@Column(name = "name",length = 50)
	private String uName;
	
	@Column(name = "city",length = 60)
	private String uCity;
	
	@Column(name = "password",length = 50)
	private String uPass;
	
	@Id
	@Column(name = "email",length = 100)
	private String uEmail;
	@Temporal(TemporalType.DATE)
	@Column(name = "addedDate")
	@Autowired
	private Date uAddedDate;

	public User() {
		super();
	}

	public User(String uName, String uCity, String uPass, String uEmail) {
		super();
		this.uName = uName;
		this.uCity = uCity;
		this.uPass = uPass;
		this.uEmail = uEmail;
		this.uAddedDate = new Date();
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuCity() {
		return uCity;
	}

	public void setuCity(String uCity) {
		this.uCity = uCity;
	}

	public String getuPass() {
		return uPass;
	}

	public void setuPass(String uPass) {
		this.uPass = uPass;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public Date getuAddedDate() {
		return uAddedDate;
	}

	public void setuAddedDate(Date uAddedDate) {
		this.uAddedDate = uAddedDate;
	}

	@Override
	public String toString() {
		return "User [uName=" + uName + ", uCity=" + uCity + ", uPass=" + uPass + ", uEmail=" + uEmail + ", uAddedDate="
				+ uAddedDate + "]";
	}

}
