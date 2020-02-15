package com.example.springBoot1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot1.entities.OrderItem;

//class to save to the database

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> { // access database

}
