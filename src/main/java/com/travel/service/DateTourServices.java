package com.travel.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.domain.DateTour;
import com.travel.repository.DateTourReponsitory;

import java.text.SimpleDateFormat;
import java.util.*;
@Service
@Transactional
public class DateTourServices implements BaseServices<DateTour>{

	@Autowired
	private DateTourReponsitory date_tour_reponsitory;
	
	@Override
	public ArrayList<DateTour> getAllObjet() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		ArrayList<DateTour> list_tour = new ArrayList<>();
		for(DateTour date_tour : date_tour_reponsitory.find_tour_sales_off(sdf.format(date))) {
			list_tour.add(date_tour);
		}
		return list_tour;
	}

	@Override
	public DateTour getObject(Object key_get) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(DateTour instence) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(DateTour instence) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(DateTour instence) {
		// TODO Auto-generated method stub
		return false;
	}

}
