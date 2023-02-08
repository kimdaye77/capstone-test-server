package com.naver.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.naver.www.mapper.ProductMapper;
import com.naver.www.model.Product;


@Service
@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper prodMapper;
//	
//	@Autowired
//    ProductRepository prodRepository;
//
//	public List<Product> getAllProds() {
//		return prodMapper.getAllProds();
//	}

	public Product getProdByName(String prodName) {
		return prodMapper.getProdByName(prodName);
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
	
	//es
//	public Iterable<Product> findAll(){
//		return prodRepository.findAll();
//	}
}
