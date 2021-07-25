package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Product;
import com.jit.boot.model.Vendor;
import com.jit.boot.repo.ProductRepository;
import com.jit.boot.repo.VendorRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository prepo;
	@Autowired
	private VendorRepository vrepo;

	@Override
	public void run(String... args) throws Exception {
		Vendor v1 = new Vendor(101, "ABC", "HYD");
		Vendor v2 = new Vendor(102, "NIT", "DHL");
		vrepo.save(v1);
		vrepo.save(v2);
		// Product p1 = new Product(10, "PEN", 20.0, "A",vrepo.findById(101).get());
		Product p1 = new Product(10, "PEN", 20.0, "A", v1);
		// Product p2 = new Product(11, "BOOK", 40.0, "B",null);
		Product p2 = new Product(11, "BOOK", 40.0, "B", v1);
		// Product p3 = new Product(12, "BTL", 80.0, "A", null);
		Product p3 = new Product(12, "BTL", 80.0, "A", v2);
		Product p4 = new Product(13, "INK", 50.0, "A", v2);
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
		prepo.save(p4);

	}

}
