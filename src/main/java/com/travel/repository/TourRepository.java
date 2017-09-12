package com.travel.repository;

import java.util.*;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.travel.domain.DateTour;
import com.travel.domain.*;

public interface TourRepository extends CrudRepository<Tour, Integer>{

	@Query(value = "select * from Tour where (tour_is_active = true) and (tour_is_delete = false) LIMIT 3", nativeQuery = true)
	ArrayList<Tour> find_tour_salse_off();
	
	
	@Query("select t from Tour t ")
	ArrayList<Tour> findAll();
	
	
}
