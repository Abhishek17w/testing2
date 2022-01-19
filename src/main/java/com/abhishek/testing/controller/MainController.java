package com.abhishek.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.testing.entity.Department;
import com.abhishek.testing.entity.Student;
import com.abhishek.testing.service.DepartmentService;
import com.abhishek.testing.service.StudentService;

@RestController("/mainPage")
public class MainController {

	@Autowired
	StudentService studentService;
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/createStudent")
	public Student createStudent(Student student) {
		Student st = studentService.createNewStudent(student);
		return st;
	}
	
	@PostMapping("/createDepartment")
	public Department createDepartment(Department department) {
		Department dt = departmentService.createDepartment(department);
		return dt;
	}
}
