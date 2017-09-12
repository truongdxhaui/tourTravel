package com.travel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.travel.domain.Tour;
import com.travel.service.TourServices;

@SpringBootApplication
public class TravelTourApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelTourApplication.class, args);

	}
}
