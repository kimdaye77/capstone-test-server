package com.naver.www.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(indexName = "product")
public class Product {
	
	@Id
	private int prodId; //상품아이디
	@Field(type = FieldType.Text)
	private String prodName; //상품명
	@Field(type = FieldType.Text)
	private String prodDesc; //상품설명
	@Field(type = FieldType.Text)
	private String prodReview; //상품후기

	
	public Product(int prodId, String prodName, String prodDesc, String prodReview) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodReview = prodReview;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getProdReview() {
		return prodReview;
	}

	public void setProdReview(String prodReview) {
		this.prodReview = prodReview;
	}
}
