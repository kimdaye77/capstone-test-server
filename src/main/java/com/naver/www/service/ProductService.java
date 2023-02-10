package com.naver.www.service;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.naver.www.model.Product;

@Service
public interface ProductService {
	
	public List<Product> getAllProds();

//	public Product getProdByName(String prodName);

	public Product registerProd(Product prod);

	public void modifyProd(String prodId, Product prod);

	public void removeProd (String prodId);
	
	//es
	public Iterable<Product> findAll();
	public <S> S save(Product prod);
//	public List<Product> findByName(String name, Pageable pagealbe);
}
