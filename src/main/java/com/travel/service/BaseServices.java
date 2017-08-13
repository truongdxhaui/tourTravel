package com.travel.service;

import java.util.ArrayList;

import antlr.collections.List;

public abstract class BaseServices<T> {
	private Class<T> services;
	public BaseServices(Class<T> services) {
        this.services = services;
    }
	public abstract ArrayList<T> getAllObjet();
	public abstract T getObject(Object key_get);
	public abstract boolean add(T instence);
	public abstract boolean update(T instence);
	public abstract boolean delete(T instence);
}
