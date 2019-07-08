package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		//repo.findByprodCode(2.5).forEach(p -> System.out.println(p.getCode() + " , " + p.getProdModel()));
		Product p = new Product();
		p.setProdCode("product code2");
		p.setProdCost(2.00);
		p.setProdVendor("ven2");
		p.setProdModel("mode2");
		//repo.save(p);
		
		System.out.println(repo.findAll());
	}

}
