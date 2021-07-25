package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.BusTicket;

public interface BusTicketRepo extends JpaRepository<BusTicket, Integer>{

}
