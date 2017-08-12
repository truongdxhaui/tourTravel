package com.truongdx.domain;

import static org.junit.Assert.fail;

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
@Table(name = "guide")
public class Guide implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "guide_id", nullable = false)
	private int id;
	
	@Column(name = "guide_name")
	private String name; 
	
	@Column(name = "guide_content")
	private String content;
	
	@Column(name = "guide_isActive")
	private boolean active;
	
	@Column(name = "guide_isDelte")
	private boolean delete;
	
	@Column(name = "guide_description")
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	public Guide() {
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
