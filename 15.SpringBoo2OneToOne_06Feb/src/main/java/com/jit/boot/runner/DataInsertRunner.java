package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.model.BusTicket;
import com.jit.boot.model.Passenger;
import com.jit.boot.repo.BusTicketRepo;
import com.jit.boot.repo.PassengerRepo;

@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private BusTicketRepo brepo;
	@Autowired
	private PassengerRepo prepo;

	@Override
	public void run(String... args) throws Exception {
		BusTicket b1 = new BusTicket(110, "A01", "HYD", "CHN", 500.0);
		BusTicket b2 = new BusTicket(111, "A02", "HYD", "DHL", 600.0);
		BusTicket b3 = new BusTicket(112, "A03", "HYD", "MUM", 700.0);
		brepo.save(b1);
		brepo.save(b2);
		brepo.save(b3);
		Passenger p1 = new Passenger(85, "ABD", "M", 50, b1);
		Passenger p2 = new Passenger(86, "MNO", "F", 36, b2);
		Passenger p3 = new Passenger(87, "PQR", "M", 28, b3);
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
	}
}