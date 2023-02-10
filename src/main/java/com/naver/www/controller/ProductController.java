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

	@GetMapping("")
	public List<Product> getAllProds() {
		return prodService.getAllProds();
	}

//	@GetMapping("/{prodName}")
//	public Product getProdByName(@PathVariable String prodName) {
//		return prodService.getProdByName(prodName);
//	}

	@PostMapping("")
	@ResponseBody
	public Product registerProd(@RequestBody Product prod) {
		return prodService.registerProd(prod);
	}

	@PutMapping("/{prodName}")
	public void modifyProd(@PathVariable String prodName, @RequestBody Product prod) {
		prodService.modifyProd(prodName, prod);
	}

	@DeleteMapping("/{prodName}")
	public void removeProd(@PathVariable String prodName) {
		prodService.removeProd(prodName);
	}
	
	//es
	@GetMapping("/es")
	public Iterable<Product> findAll() {
		return prodService.findAll();
	}
	
//	@GetMapping("/{prodName}")
//	public List<Product> getProdByName(@PathVariable String name, Pageable pageable) {
//		return prodService.findByName(name, pageable);
//	}
//	
	@PostMapping("/save")
	@ResponseBody
	public Product save(@RequestBody Product prod) {
		return prodService.save(prod);
	}
}
