package com.travel.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "person")
public class Person extends MDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int id;
	
	@Column(name = "person_midName")
	@Size(min = 1 , max = 20)
	private String midName;
	
	@Column(name = "person_firstName")
	@Size(min = 1 , max = 20)
	private String firstName;
	
	@Column(name = "person_lastName")
	@Size(min = 1 , max = 20)
	private String lastName;
	
	@Column(name = "person_fullname")
	@Size(min = 1 , max = 60)
	private String fullName;
	
	@Column(name = "person_dob")
	private Date dob;
	
	@Column(name = "person_gender")
	private boolean gender;
	
	@Column(name = "person_email")
	@Size(min = 1 , max = 50)
	private String email;
	
	@Column(name = "person_mobile")
	@Size(min = 1 , max = 30)
	private String mobile;
	
	@Column(name = "person_passport")
	@Size(min = 1 , max = 30)
	private String passport;
	
	@Column(name = "person_facebook")
	@Size(min = 1 , max = 100)
	private String facebook;
	
	@Column(name = "person_address")
	@Size(min = 1 , max = 100)
	private String address;

	@OneToMany(fetch  = FetchType.LAZY, mappedBy = "person")
	private Set<User> users;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
