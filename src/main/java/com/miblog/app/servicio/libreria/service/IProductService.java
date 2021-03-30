package com.miblog.app.servicio.libreria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miblog.app.servicio.libreria.entity.Product;

public interface IProductService {
	
	public List<Product> findAll();
	public Product findById(Long id);
}
