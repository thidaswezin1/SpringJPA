package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserAccountRepository extends JpaRepository<User, Integer> {

}
