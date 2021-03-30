package com.miblog.app.servicio.libreria.repository;

import org.springframework.data.repository.CrudRepository;

import com.miblog.app.servicio.libreria.entity.Product;

public interface IProductRepository extends CrudRepository<Product, Long>{

}
