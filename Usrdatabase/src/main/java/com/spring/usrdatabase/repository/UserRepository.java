package com.spring.usrdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.usrdatabase.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	User findByUsername(String username);

}