package com.ibm.poc.order.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	private int productCode;
	private String productDesc;
	private double productCost;
	
	public Product() {
	}
	
	public Product(int productCode, String productDesc, double productCost) {
		super();
		this.productCode = productCode;
		this.productDesc = productDesc;
		this.productCost = productCost;
	}
	
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	

}
