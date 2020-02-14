package com.example.springBoot1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { // access database

}
