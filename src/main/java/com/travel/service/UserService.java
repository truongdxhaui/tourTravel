package com.travel.service;

import java.util.List;

import com.travel.domain.User;


public interface UserService {

	Iterable<User> findAll();

	List<User> seach(String q);
	
	User findOne(int id);

	void save(User user);

	void delete(int id);
	
}
