package com.travel.repository;

import java.util.*;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.travel.domain.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer>{

	@Query(value = "select * from Tour LIMIT 3", nativeQuery = true)
	ArrayList<Tour> find_tour_salse_off();
	
	@Query("select t from Tour t ")
	ArrayList<Tour> findAll();
	
	
}
