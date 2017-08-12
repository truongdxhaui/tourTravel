package com.travel.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "dateTour")
public class DateTour extends MDomain implements Serializable{
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dateTour_id", nullable = false)
	private int id;
	
	@Column(name = "dateTour_startDate")
	private String startDate;
	
	@Column(name = "dateTour_endDate")
	private String endDate;
	
	@Column(name = "dateTour_avaiableSeat")
	private int avaiableSeat;
	
	@Column(name = "dateTour_isActive")
	private boolean active;
	
	@Column(name = "dateTour_isDelete")
	private boolean delete;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Tour tour;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dateTour")
	private Set<Order> orders;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getAvaiableSeat() {
		return avaiableSeat;
	}
	public void setAvaiableSeat(int avaiableSeat) {
		this.avaiableSeat = avaiableSeat;
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
	public Tour getTour() {
		return tour;
	}
	public void setTour(Tour tour) {
		this.tour = tour;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
