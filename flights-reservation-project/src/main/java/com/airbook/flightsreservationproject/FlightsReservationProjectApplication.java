package com.airbook.flightsreservationproject;


import com.airbook.flightsreservationproject.service.AirlineService;

import com.airbook.flightsreservationproject.service.AirportService;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FlightsReservationProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FlightsReservationProjectApplication.class, args);
		AirportService s = context.getBean(AirportService.class);
		s.invoke();


	}


}
