package com.travel;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.travel.domain.Tour;
import com.travel.service.TourServices;

@SpringBootApplication
public class TravelTourApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelTourApplication.class, args);
		
//		TourServices ts = new TourServices();
//		ArrayList<Tour> list = new ArrayList<>();
//		list = ts.getAllObjet();
//		for(Tour tour : list) {
//			System.out.println(tour);
//		}
	}
}
