package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	interface ViewA{
		String getCode();
		String getProdModel();
	}

	interface ViewB{
		Double getCost();
		String getProdVendor();
	}

	//Product findById();
	//List<ViewA> findByprodCode(Double prodCost);
	//List<ViewB> findByProdCode(Double prodCost);

}
