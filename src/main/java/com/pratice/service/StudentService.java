package com.pratice.service;

import java.util.ArrayList;
import java.util.Map;

import com.pratice.exceptions.StudentException;
import com.pratice.models.Student;

public interface StudentService {

	public Student addStudentAndMarks(Student student) throws StudentException;
	
	
	public Integer getWholeClassAvgPercentageInRecentSem() throws StudentException;
	
	
	public Map<String,Integer> getAvgMarksOfStudentInSubject() throws StudentException;
	
	
	public ArrayList<String> topTwoConsistenceStudents() throws StudentException;
	
}
