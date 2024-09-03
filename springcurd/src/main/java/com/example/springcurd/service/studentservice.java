package com.example.springcurd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springcurd.entity.student;
import com.example.springcurd.repository.studentrepository;

@Service
public class studentservice {

	@Autowired
	private studentrepository srepo;
	
	public student addStudent(student std) {
		return srepo.save(std);
	}
	
	public List<student> getStudent() {
		return srepo.findAll();
	}
	
	public student updateStudent(student student) {
		Integer roll = student.getRoll();
		student std = srepo.findById(roll).get();
		std.setName(student.getName());
		std.setCollege(student.getCollege());
		std.setCourse(student.getCourse());
		return srepo.save(std);
	}
	
	//Delete
	public void deleteStudent(Integer id) {
		srepo.deleteById(id);
	}

}
