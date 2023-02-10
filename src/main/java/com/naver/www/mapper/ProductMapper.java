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

	@Autowired
	ProductRepository prodRepository;
	
	//es
	public Iterable<Product> findAll() {
		return prodRepository.findAll();
	}
	public Product save(Product prod) {
		prodRepository.save(prod);
		return prod;
	}
	public void delete(Product prod) {
		prodRepository.delete(prod);
	}
	
	public void deleteById(String name) {
		prodRepository.deleteById(name);
	}
	public Optional<Product> findById(String id) {
		return prodRepository.findById(id);
	}

	public void update(String name, Product prod) {
		if(prodRepository.existsById(name)) {
			prodRepository.deleteById(name);
			prodRepository.save(prod);
		}
	}
}
