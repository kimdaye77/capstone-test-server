package com.naver.www.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.naver.www.model.Product;
import com.naver.www.repository.ProductRepository;

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

	@Autowired
	ProductRepository prodRepository;
	
	public List<Product> getAllProds() {
		return prods;
	}

//	public Product getProdByName(String prodName) {
//		return prods.stream()
//			.filter(prod -> prod.getProdName().equals(prodName))
//			.findAny()
//			.orElse(new Product(-1, "", "", ""));
//	}
//	public Product findByName(String prodName) {
//		return prodRepository.findByName(prodName)
//				.stream()
//			.filter(prod -> prod.getProdName().equals(prodName))
//			.findAny()
//			.orElse(new Product(-1, "", "", ""));
//	}

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
	
	//es
	public Iterable<Product> findAll() {
		return prodRepository.findAll();
	}
//	public List<Product> findByName(String name, Pageable pageable) {
//		return prodRepository.findByName(name);
//	}
	public Product save(Product prod) {
		prodRepository.save(prod);
		return prod;
	}
	public void delete(Product prod) {
		prodRepository.delete(prod);
	}
	public Optional<Product> findOne(Integer id) {
		return prodRepository.findById(id.toString());
	}
}
