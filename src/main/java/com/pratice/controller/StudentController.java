package com.pratice.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.exceptions.StudentException;
import com.pratice.models.Student;
import com.pratice.service.StudentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) throws StudentException{
		
		return new ResponseEntity<Student>(studentService.addStudentAndMarks(student),HttpStatus.ACCEPTED);
		
	}
	
	
	@GetMapping("/get_avg_students_marks")
	public ResponseEntity<Integer> getWholeClassAvgPercentageInRecentSem() throws StudentException{
		
   return new ResponseEntity<Integer>(studentService.getWholeClassAvgPercentageInRecentSem(),HttpStatus.OK);
		
	}
	
	@GetMapping("/get_avg_marks")
	public ResponseEntity<Map<String, Integer>> getAvgMarksOfStudentInSubject() throws StudentException {
		
	
		return new ResponseEntity<Map<String, Integer>>(studentService.getAvgMarksOfStudentInSubject(),HttpStatus.OK);
		
	}
	
	

	@GetMapping("/top_two_students")
	public ResponseEntity<ArrayList<String>> topTwoConsistenceStudents() throws StudentException{
		
		return new ResponseEntity<ArrayList<String>>(studentService.topTwoConsistenceStudents(),HttpStatus.OK);
		
		
	}
	
	
}
