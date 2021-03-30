package com.miblog.app.servicio.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miblog.app.servicio.libreria.entity.Product;
import com.miblog.app.servicio.libreria.repository.IProductRepository;

@Service
public class ProductoServiceImpl implements IProductService {

	@Autowired	
	private IProductRepository productRepo;
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return (List<Product>) productRepo.findAll();
	}

	@Override
	public Product findById(Long id) {
		return productRepo.findById(id).orElse(null);
	}

}
