package com.spring.usrdatabase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.usrdatabase.model.Students;

@Repository
public interface StudentsRepo extends JpaRepository<Students, String> {

	List<Students> findByNameStartingWith(String prefix);

	List<Students> findByNameEndingWith(String suffix);




}