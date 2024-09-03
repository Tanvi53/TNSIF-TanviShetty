package com.example.springcurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springcurd.entity.student;

public interface studentrepository extends JpaRepository<student,Integer> {
	

}

