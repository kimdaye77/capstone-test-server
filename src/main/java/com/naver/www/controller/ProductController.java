package com.naver.www.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naver.www.model.Product;
import com.naver.www.service.ProductService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/prods")
public class ProductController {

	@Autowired
	private ProductService prodService;
	
	//es
	@GetMapping("")
	public Iterable<Product> findAll() {
		return prodService.findAll();
	}
	
	@GetMapping("/{id}")
	public List<Product> findById(@PathVariable String id) {
		return prodService.findById(id);
	}
	
	@PostMapping("/save")
	@ResponseBody
	public Product save(@RequestBody Product prod) {
		return prodService.save(prod);
	}
	
	@DeleteMapping("")
	public void delete(@PathVariable Product prod) {
		prodService.delete(prod);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable String id) {
		prodService.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void modifyProd(@PathVariable String id, @RequestBody Product prod) {
		prodService.update(id, prod);
	}

}
