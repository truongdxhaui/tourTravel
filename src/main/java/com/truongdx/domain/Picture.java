package com.truongdx.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "picture")
public class Picture implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "picture_id", nullable = false)
	private int id;
	
	@Column(name = "picture_name")
	private String name;
	
	@Column(name = "picture_isActive")
	private boolean active;
	
	@Column(name = "picture_isDelete")
	private boolean delete;
	
	@Column(name = "picture_type")
	private int type;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "picture_tour", joinColumns = @JoinColumn(name = "picture_id"), inverseJoinColumns =  @JoinColumn(name = "tour_id"))
	private Set<Tour> tours;

	
	
	public Set<Tour> getTours() {
		return tours;
	}

	public void setTours(Set<Tour> tours) {
		this.tours = tours;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
