package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repository.ProductRepository;

@Component
public class Runner implements CommandLineRunner{

	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Product p = new Product();
		p.setPcode("AA");
		p.setPcost(102.2);
		p.setPid(10);
		productRepository.save(p);
		System.out.println("succesfully saved");
	}


}
