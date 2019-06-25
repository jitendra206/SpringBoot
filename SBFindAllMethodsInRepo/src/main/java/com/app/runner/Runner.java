package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repository.ProductRepository;

@Component
public class Runner  implements CommandLineRunner {

	@Autowired
	ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Product p = new Product();
		p.setPcode("AnewProductcode");
		p.setPcost(105.2);
		//repo.save(p);
		System.out.println("saved Succesfully");
		displayAllRecords();
		sortAndDisplayRecords();
	}

	public void displayAllRecords() {
		System.out.println("--------findAllList------");
		List<Product> plist = repo.findAll();
		//plist.forEach(System.out::println);
	}

	public void sortAndDisplayRecords() {
		List<Product> sortedList = repo.findAll(Sort.by("pcost"));
		System.out.println("--------sortBy pcost------");
		sortedList.forEach(System.out::println);
		
		List<Product> descsortedList = repo.findAll(Sort.by(Direction.DESC, "pcode"));
		System.out.println("--------sortBy pcode desc------");
		descsortedList.forEach(System.out::println);
		
		List<Product> ascSortedList = repo.findAll(Sort.by(Direction.ASC, "pcode"));
		System.out.println("--------sortBy pcode Asc------");
		ascSortedList.forEach(System.out::println);
	}

}
