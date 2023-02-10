package com.naver.www.service;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.naver.www.model.Product;

@Service
public interface ProductService {
	//es
	public Iterable<Product> findAll();
	public List<Product> findById(String id);
	public Product save(Product prod);
	public void delete(Product prod);
	public void deleteById(String id);
	public void update(String id, Product prod);
}
