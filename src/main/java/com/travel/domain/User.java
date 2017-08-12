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
@Table(name = "user")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", nullable = false)
	private int id;

	@Column(name = "user_username", nullable = false)
	private String username;

	@Column(name = "user_password", nullable = false)
	private String password;

	@Column(name = "user_isActive")
	private boolean active;

	@Column(name = "user_isDelete")
	private boolean delete;

	@Column(name = "user_countLogin")
	private int countLogin;

	@Column(name = "user_avatar")
	private int avatar;

	 @ManyToOne(fetch = FetchType.LAZY)
	private Person person;

	 @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Set<Guide> guides;

	 @ManyToMany(mappedBy = "users")
	private Set<Role> roles;

	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Tour> tours;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getCountLogin() {
		return countLogin;
	}

	public void setCountLogin(int countLogin) {
		this.countLogin = countLogin;
	}

	public int getAvatar() {
		return avatar;
	}

	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Set<Guide> getGuides() {
		return guides;
	}

	public void setGuides(Set<Guide> guides) {
		this.guides = guides;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Tour> getTours() {
		return tours;
	}

	public void setTours(Set<Tour> tours) {
		this.tours = tours;
	}

}
