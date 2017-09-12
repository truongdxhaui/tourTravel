package com.travel.service;


import java.util.ArrayList;

import org.assertj.core.api.Assert;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import com.travel.domain.*;
import com.travel.repository.TourRepository;

import antlr.collections.List;

@Service
@Transactional
public class TourServices implements BaseServices<Tour> {

	@Autowired
	private TourRepository tourRepository;

	//get all tour sale of
	@Override
	public ArrayList<Tour> getAllObjet() {
		ArrayList<Tour> list_tour = new ArrayList<>();
		for (Tour tour : tourRepository.findAll()) {
			list_tour.add(tour);
		}
		return list_tour;
	}

	@Override
	public Tour getObject(Object key_get) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Tour instence) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Tour instence) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Tour instence) {
		// TODO Auto-generated method stub
		return false;
	}
	public ArrayList<Tour> get_all_tour_sales(){
		ArrayList<Tour> list_tour = new ArrayList<>();
		for (Tour tour : tourRepository.find_tour_salse_off()) {
			list_tour.add(tour);
		}
		return list_tour;
	}
}
