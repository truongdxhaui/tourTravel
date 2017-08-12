package com.travel.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "order_tour")
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy =GenerationType.AUTO)
	@Column(name = "order_id", nullable = false)
	private int id;
	
	@Column(name = "order_fullname")
	private String fullname;
	
	@Column(name = "order_mobile")
	private String mobile;
	
	@Column(name = "order_email")
	private String email;
	
	@Column(name = "order_numOfTravel")
	private int numOfTravel;
	
	@Column(name = "order_pdd")
	private String pdd;
	
	@Column(name = "order_description")
	private String description;
	
	@Column(name = "order_isPayment")
	private boolean payment;
	
	@Column(name = "order_isActive")
	private boolean active;
	
	@Column(name = "order_idDelete")
	private boolean delete;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private DateTour dateTour;
	
	
	
	public DateTour getDateTour() {
		return dateTour;
	}
	public void setDateTour(DateTour dateTour) {
		this.dateTour = dateTour;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumOfTravel() {
		return numOfTravel;
	}
	public void setNumOfTravel(int numOfTravel) {
		this.numOfTravel = numOfTravel;
	}
	public String getPdd() {
		return pdd;
	}
	public void setPdd(String pdd) {
		this.pdd = pdd;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPayment() {
		return payment;
	}
	public void setPayment(boolean payment) {
		this.payment = payment;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
