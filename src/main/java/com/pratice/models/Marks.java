package com.pratice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	private Integer sem1_sci;
	
	private Integer sem1_math;
	
	private Integer sem1_eng;
	
	
    private Integer sem2_sci;
	
	private Integer sem2_math;
	
	private Integer sem2_eng;
	
}