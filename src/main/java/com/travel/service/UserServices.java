package com.travel.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.travel.domain.User;

@Service
@Transactional
public class UserServices implements BaseServices<User> {

	@Override
	public ArrayList<User> getAllObjet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getObject(Object key_get) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(User instence) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User instence) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User instence) {
		// TODO Auto-generated method stub
		return false;
	}

}
