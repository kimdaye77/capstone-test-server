package com.naver.www.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.naver.www.model.Product;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {
	Product save(Product prod);
	Iterable<Product> findAll();
//	List<Product> findByName(String name);
}