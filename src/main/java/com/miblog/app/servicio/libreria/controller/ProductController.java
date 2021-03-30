package com.miblog.app.servicio.libreria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miblog.app.servicio.libreria.entity.Product;
import com.miblog.app.servicio.libreria.service.IProductService;


@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar")
	public List<Product> listar() {
		return productService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Product detalle(@PathVariable Long id) {
		return productService.findById(id);
	}

}
