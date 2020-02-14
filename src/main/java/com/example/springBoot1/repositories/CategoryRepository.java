package com.example.springBoot1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot1.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> { // access database

}
