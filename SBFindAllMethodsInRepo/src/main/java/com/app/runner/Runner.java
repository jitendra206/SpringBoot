package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

		PageRequest pageable = PageRequest.of(0, 3);
		Page<Product> pagingRecords = repo.findAll(pageable);
		System.out.println("--------Pagination------");
		pagingRecords.forEach(System.out::println);

		//findAll(Example) -> only fetch matched & not null values
		Product product = new Product();	
		product.setPcost(10.2);
		Example<Product> example = Example.of(product);
		List<Product> productList = repo.findAll(example);
		System.out.println("--------findAll(Example)------");
		productList.stream().forEach(p->System.out.println(p.getPid()+" "+p.getPcost()+" "+p.getPcode()));

		Product p = new Product();
		p.setPcode("A");
		Example<Product> exPList = Example.of(p);
		List<Product> pList=repo.findAll(Sort.by(Direction.DESC , "pcost"));
		System.out.println("--------findAll(Example) with sort------");
		pList.forEach(System.out::println);
		
		Product p1 = new Product();
		p1.setPcost(20.2);
		Example<Product> exProd = Example.of(p1);
		
		
		
		
	}

}
