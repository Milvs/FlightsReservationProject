package com.airbook.flightsreservationproject;


import com.airbook.flightsreservationproject.service.AirlineService;

import com.airbook.flightsreservationproject.service.AirportService;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FlightsReservationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightsReservationProjectApplication.class, args);
//		ApplicationContext context = SpringApplication.run(FlightsReservationProjectApplication.class, args);
////		AirportService s = context.getBean(AirportService.class);
//		AirlineService s = context.getBean(AirlineService.class);
//		s.invoke();


	}


}
