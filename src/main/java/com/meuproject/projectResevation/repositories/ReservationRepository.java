package com.meuproject.projectResevation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuproject.projectResevation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long>{

}
