package com.jit.boot.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Product;
import com.jit.boot.repo.ProductRepository;

@Component
public class TestJpaRepoRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		FileInputStream fis = new FileInputStream("../08.SpringBoot2DataJpaRepoJpaBlobClobEx_25Jan/my_laptop.jpg");
		byte[] img = new byte[fis.available()];
		fis.read(img);

		String dataStr = "HEllo abcdefgh!HEllo abcdefgh!HEllo abcdefgh!HEllo abcdefgh!HEllo abcdefgh!HEllo abcdefgh!HElloabcdefgh!HEllo abcdefgh!HEllo abcdefgh!HEllo abcdefgh!HElloabcdefgh!HEllo abcdefgh!";
		char[] data = dataStr.toCharArray();
		repo.save(new Product(100, "ABC", 500.0, img, data));
		fis.close();

	}

}
