package com.travel.domain;

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
@Table(name = "category")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id", nullable = false)
	private int id;
	
	@Column(name = "category_name")
	private String name;
	
	@Column(name = "category_related")
	private int related;
	
	@Column(name = "category_isActive")
	private boolean active;
	
	@Column(name = "category_isDelete")
	private boolean delete;
	
	@Column(name = "category_description")
	private String description;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "category_tour", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "tour_id"))
	private Set<Tour> tours;
	
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
	
	public int getRelated() {
		return related;
	}
	public void setRelated(int related) {
		this.related = related;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Tour> getTours() {
		return tours;
	}
	public void setTours(Set<Tour> tours) {
		this.tours = tours;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
