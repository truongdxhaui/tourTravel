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
import javax.validation.constraints.Size;

@Entity
@Table(name = "tour")
public class Tour extends MDomain implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tour_id", nullable = false)
	private int id;
	
	@Column(name = "tour_name", nullable = false)
	@Size(min = 1 , max = 100)
	private String name;
	
	@Column(name = "tour_time")
	private int time;
	
	@Column(name = "tour_quantity")
	private int quantity;  
	
	@Column(name = "tour_isActive")
	private boolean active;
	
	@Column(name = "tour_isDelete")
	private boolean delete;
	
	@Column(name = "tour_price")
	private int price;
	
	@Column(name = "tour_seat")
	private int seat;
	
	@Column(name = "tour_description")
	private String description;
	
	@ManyToMany(mappedBy = "tours", fetch = FetchType.LAZY)
	private Set<Country> countries;
	
	@ManyToMany(mappedBy = "tours", fetch = FetchType.LAZY)
	private Set<Category> categories;
	
	@OneToMany(mappedBy= "tour", fetch = FetchType.LAZY)
	private Set<Detail> details;
	
	@ManyToMany(mappedBy = "tours", fetch = FetchType.LAZY)
	private Set<Picture> pictures;
	
	@OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
	private Set<DateTour> dateTours;

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	
	public User getUsers() {
		return user;
	}

	public void setUsers(User users) {
		this.user = users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Set<Detail> getDetails() {
		return details;
	}

	public void setDetails(Set<Detail> details) {
		this.details = details;
	}

	public Set<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(Set<Picture> pictures) {
		this.pictures = pictures;
	}

	public Set<DateTour> getDateTours() {
		return dateTours;
	}

	public void setDateTours(Set<DateTour> dateTours) {
		this.dateTours = dateTours;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
