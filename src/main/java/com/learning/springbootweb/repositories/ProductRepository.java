package com.learning.springbootweb.repositories;

import com.learning.springbootweb.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}