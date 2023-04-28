package com.example.swe645hw3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import com.example.swe645hw3.model.Student;
import com.example.swe645hw3.service.StudentService;

@RestController
@RequestMapping(value="/student_survey_form")
public class controller {
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/getAll")
	public List<Student> getAll() {
		return studentService.findAll();
	}

	@PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }
}
