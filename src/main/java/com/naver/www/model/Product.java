package com.naver.www.model;

public class Product {
	private int prodId; //상품아이디
	private String prodName; //상품명
	private String prodDesc; //상품설명
	private String prodReview; //상품후기

	public Product() {

	}

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
