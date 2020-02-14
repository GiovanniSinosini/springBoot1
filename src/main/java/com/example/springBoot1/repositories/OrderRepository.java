package com.example.springBoot1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> { // access database

}
