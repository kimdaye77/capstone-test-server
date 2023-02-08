package com.naver.www.service;


import org.springframework.stereotype.Service;

import com.naver.www.model.Product;

@Service
public interface ProductService {
//
//	public List<Product> getAllProds();

	public Product getProdByName(String prodName);

	public Product registerProd(Product prod);

	public void modifyProd(String prodId, Product prod);

	public void removeProd (String prodId);
	
	//es
//	public Iterable<Product> findAll();
}
