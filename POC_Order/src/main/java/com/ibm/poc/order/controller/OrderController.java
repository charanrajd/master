package com.ibm.poc.order.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping
	public String message() {

		System.out.println(" u r in controller class  ");
		return "welcome to spring boot this is order POC ";
	}
	
	@GetMapping(path = "/addCart/{productId}", produces = "application/json")
	public ResponseEntity<String> addcart(@PathVariable int productId) {
		return new ResponseEntity<>(cartService.addProduct(productId), HttpStatus.OK);
	}
}
