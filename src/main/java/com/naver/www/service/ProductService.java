package com.naver.www.service;

import java.util.List;

import com.naver.www.model.Product;

public interface ProductService {

	public List<Product> getAllProds();

	public Product getProdByProdName(String prodName);

	public Product registerProd(Product prod);

	public void modifyProd(String prodId, Product prod);

	public void removeProd (String prodId);
}
