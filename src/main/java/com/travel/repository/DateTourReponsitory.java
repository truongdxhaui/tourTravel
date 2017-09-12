package com.travel.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.travel.domain.*;

import java.text.SimpleDateFormat;
import java.util.*;

public interface DateTourReponsitory extends CrudRepository<DateTour, Long>{
	@Query(value = "select * from date_tour where (date_tour_is_active = true) and (date_tour_is_delete = false) and (date_tour_sales_off > 0) and (date_tour_start_date >= :current_date) limit 3 ", nativeQuery = true)
	public ArrayList<DateTour>find_tour_sales_off(@Param("current_date") String current_date);
}
