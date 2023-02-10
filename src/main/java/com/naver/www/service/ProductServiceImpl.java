package com.naver.www.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.naver.www.mapper.ProductMapper;
import com.naver.www.model.Product;
import com.naver.www.repository.ProductRepository;


@Service
@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper prodMapper;
	
	public List<Product> getAllProds() {
		return prodMapper.getAllProds();
	}

//	public Product getProdByName(String prodName) {
//		return prodMapper.getProdByName(prodName);
//	}

	public Product registerProd(Product prod) {
		return prodMapper.InsertProd(prod);
	}

	public void modifyProd(String userId, Product user) {
		prodMapper.updateProd(userId, user);
	}

	public void removeProd(String prodName) {
		prodMapper.deleteProd(prodName);
	}

	// es
	public Iterable<Product> findAll() {
		return prodMapper.findAll();
	}
//	public List<Product> findByName(String name, Pageable pageable){
//		return prodMapper.findByName(name, pageable).stream().collect(Collectors.toList());
//	}
	public Product save(Product prod){
		return prodMapper.save(prod);
	}
}
