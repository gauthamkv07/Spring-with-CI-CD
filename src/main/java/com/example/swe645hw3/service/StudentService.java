package com.example.swe645hw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swe645hw3.model.Student;
import com.example.swe645hw3.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> findAll() {
		return studentRepository.findAll();
	}
	
	public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
}
