package com.ibm.poc.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ibm.poc.order.entity.Product;


@FeignClient(name="product_poc")
public interface OrderService {

	@GetMapping(path = "/getProduct/{productId}", produces = "application/json")
	public ResponseEntity<Product> getProduct(@PathVariable int productId);
}
