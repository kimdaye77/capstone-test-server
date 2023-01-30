package com.naver.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.www.mapper.ProductMapper;
import com.naver.www.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper prodMapper;

	public List<Product> getAllProds() {
		return prodMapper.getAllProds();
	}

	public Product getProdByProdName(String prodName) {
		return prodMapper.getProdByProdName(prodName);
	}

	public Product registerProd(Product prod) {
		return prodMapper.InsertProd(prod);
	}

	public void modifyProd(String userId, Product user) {
		prodMapper.updateProd(userId, user);
	}

	public void removeProd(String prodName) {
		prodMapper.deleteProd(prodName);
	}
}
