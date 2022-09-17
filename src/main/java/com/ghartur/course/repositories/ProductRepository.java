package com.ghartur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghartur.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
