package com.naver.www.mapper;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.naver.www.model.Product;

@Repository
public class ProductMapper {

	public static List<Product> prods;

	static {
		prods = new ArrayList<Product>();
		prods.add(new Product(1, "test1", "testdesc1", "1234"));
		prods.add(new Product(2, "test2", "testdesc2", "1234"));
		prods.add(new Product(3, "test3", "testdesc3", "1234"));
		prods.add(new Product(4, "test4", "testdesc4", "1234"));
		prods.add(new Product(5, "test5", "testdesc5", "1234"));
	}

	public List<Product> getAllProds() {
		return prods;
	}

	public Product getProdByName(String prodName) {
		return prods.stream()
			.filter(prod -> prod.getProdName().equals(prodName))
			.findAny()
			.orElse(new Product(-1, "", "", ""));
	}

	public Product InsertProd(Product prod) {
		prods.add(prod);

		return prod;
	}

	public void updateProd(String prodName, Product prod) {
		prods.stream()
			.filter(curProd -> curProd.getProdName().equals(prodName))
			.findAny()
			.orElse(new Product(-1, "", "", ""))
			.setProdName(prod.getProdName());
	}

	public void deleteProd(String prodName) {
		prods.removeIf(user -> user.getProdName().equals(prodName));
	}
}
