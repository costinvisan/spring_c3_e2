package com.endava.spring_c3_e2.repositories;

import com.endava.spring_c3_e2.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
