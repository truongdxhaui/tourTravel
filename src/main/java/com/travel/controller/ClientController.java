package com.travel.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.travel.domain.*;
import com.travel.service.*;

@Controller
public class ClientController extends BaseController{
	@Autowired
	private TourServices tour_service;
	
	@Autowired
	private DateTourServices date_tour_service;

	@GetMapping("/login_admin")
	public String login() {
		return "login";
	}

	//get tour sales off
	@RequestMapping(value = "/")
	public ModelAndView homepage() {
		ModelAndView model_list_tour = new ModelAndView("index");
		ArrayList<DateTour> list_tour = date_tour_service.getAllObjet();
		model_list_tour.addObject("list_tour_sales_off", list_tour);
		return model_list_tour;
	}
	
	@RequestMapping("/list_tour_sales_off")
	public ModelAndView list_tour() {
		ModelAndView model_list_tour = new ModelAndView("packages-list-left-sidebar");
		ArrayList<Tour> list_tour = tour_service.getAllObjet();
		model_list_tour.addObject("list_tour", list_tour);
		return model_list_tour;
	}
}
