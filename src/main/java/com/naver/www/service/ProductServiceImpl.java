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
	// es
	public Iterable<Product> findAll() {
		return prodMapper.findAll();
	}
	public List<Product> findById(String id){
		return prodMapper.findById(id).stream().collect(Collectors.toList());
	}
	public Product save(Product prod){
		return prodMapper.save(prod);
	}
	
	public void delete(Product prod) {
		prodMapper.delete(prod);
	}
	
	public void deleteById(String id) {
		prodMapper.deleteById(id);
	}
	
	public void update(String id, Product prod) {
		prodMapper.update(id, prod);
	}

}
