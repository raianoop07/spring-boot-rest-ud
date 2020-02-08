package com.example.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
