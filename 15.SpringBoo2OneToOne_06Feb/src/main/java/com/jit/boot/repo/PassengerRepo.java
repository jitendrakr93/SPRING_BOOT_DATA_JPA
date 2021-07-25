package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Integer>{

}
