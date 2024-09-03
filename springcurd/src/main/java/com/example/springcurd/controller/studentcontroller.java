package com.example.springcurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcurd.entity.student;
import com.example.springcurd.service.studentservice;

@RestController
public class studentcontroller {
	
	@Autowired
	public studentservice service;
	
	@PostMapping("/addstudent")
	public student regStudent(@RequestBody student std) {
		return service.addStudent(std);
	}
	
	@GetMapping("/getstudent")
	public List<student> getStudent() {
		return service.getStudent();
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		service.deleteStudent(id);
	}
	
	@PutMapping("/updatestudent")
	public student updateStudent(@RequestBody student student) {
		return service.updateStudent(student);
	}
}
