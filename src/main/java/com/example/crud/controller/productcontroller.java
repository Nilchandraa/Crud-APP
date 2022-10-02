package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.exception.ResourceNotFoundException;
import com.example.crud.model.product;
import com.example.crud.repository.productrepository;
@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/api/v1")
public class productcontroller {
	
	@Autowired
	private productrepository productrepository;
	
	@GetMapping("/product")
	public List<product> getALLProducts() {
		return productrepository.findAll();
	}
	@PostMapping("/product")
	public product createProduct(product Product) {
	return productrepository.save(Product);
}


}
