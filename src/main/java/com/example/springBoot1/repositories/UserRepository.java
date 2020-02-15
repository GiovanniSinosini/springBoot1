package com.example.springBoot1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot1.entities.User;

//class to save to the database

public interface UserRepository extends JpaRepository<User, Long> { // access database

}
