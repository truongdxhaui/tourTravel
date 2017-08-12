package com.travel.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.engine.profile.Fetch;

@Entity
@Table(name = "region")
public class Region implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "region_id", nullable = false)
	private int id;
	
	@Column(name = "region_name", nullable = false)
	private String name;
	
	@Column(name = "region_related")
	private int related;
	
	@Column(name = "region_isactive")
	private boolean active;
	
	@Column(name = "region_isdelete")
	private boolean delete;
	
	@Column(name = "region_description")
	private String description;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
	private Set<Country> countries;
	
	
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Set<Country> getCountries() {
		return countries;
	}
	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}
	
	
}
