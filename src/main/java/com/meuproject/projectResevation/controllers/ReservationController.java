package com.meuproject.projectResevation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuproject.projectResevation.entities.Reservation;
import com.meuproject.projectResevation.repositories.ReservationRepository;

@RestController
@RequestMapping(value="/reservations")
public class ReservationController {

	@Autowired
	private ReservationRepository repository;
	
	@GetMapping
	public List<Reservation>findAll(){
		List<Reservation>result=repository.findAll();
		return result;
	}
	@GetMapping(value="/{id}")
	public Reservation findById(@PathVariable Long id){
		Reservation result=repository.findById(id).get();
		return result;
	}
	
}
