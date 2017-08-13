package com.travel.service;

import java.util.ArrayList;

import antlr.collections.List;

public abstract class BaseServices<T> {
<<<<<<< HEAD
	private Class<T> service;
	public BaseServices(Class<T> obj) {
        this.service = obj;
=======
	private Class<T> services;
	public BaseServices(Class<T> services) {
        this.services = services;
>>>>>>> branch 'master' of https://github.com/truongdxhaui/tourTravel.git
    }
	public abstract ArrayList<T> getAllObjet();
	public abstract T getObject(Object key_get);
	public abstract boolean add(T instence);
	public abstract boolean update(T instence);
	public abstract boolean delete(T instence);
}
