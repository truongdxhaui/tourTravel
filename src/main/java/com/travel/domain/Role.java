package com.travel.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "role")
public class Role extends MDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	
	
	
	public Role(@Size(min = 1, max = 50) String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private int id;
	
	@Column(name = "role_name", nullable = false)
	@Size(min = 1 , max = 50)
	private String name;
	
	@ManyToMany
	@JoinTable( name = "role_user", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Set<User> users;
	
	
	public Role() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int role_id) {
		this.id = role_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String role_name) {
		this.name = role_name;
	}
	
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}


}
