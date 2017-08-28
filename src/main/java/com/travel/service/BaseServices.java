package com.travel.service;

import java.util.ArrayList;

import antlr.collections.List;

public interface BaseServices<T> {

	public abstract ArrayList<T> getAllObjet();

	public abstract T getObject(Object key_get);

	public abstract boolean add(T instence);

	public abstract boolean update(T instence);

	public abstract boolean delete(T instence);
}
