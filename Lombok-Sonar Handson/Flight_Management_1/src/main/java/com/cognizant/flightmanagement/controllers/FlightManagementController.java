package com.cognizant.flightmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognizant.flightmanagement.models.Passenger;
import com.cognizant.flightmanagement.services.FlightManagementService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FlightManagementController {
	
	@Autowired
	private FlightManagementService service;
	
	@PostMapping(value="/flights/business")
	public void addBussinessFlight(@RequestBody Passenger passenger) {
		service.getFlight().setFlightType("BUSINESS");
		service.addPassenger(passenger);
	}
	
	@PostMapping(value="/flights/economy")
	public void addEconomyFlight(@RequestBody Passenger passenger) {
		service.getFlight().setFlightType("ECONOMY");
		service.addPassenger(passenger);
	}
	
	@DeleteMapping(value="/flights/business")
	public void removeBussinessFlight(@RequestBody Passenger passenger) {
		service.getFlight().setFlightType("BUSINESS");
		service.removePassenger(passenger);
	}
	
	@DeleteMapping(value="/flights/economy")
	public void removeEconomyFlight(@RequestBody Passenger passenger) {
		service.getFlight().setFlightType("ECONOMY");
		service.removePassenger(passenger);
	}
}
