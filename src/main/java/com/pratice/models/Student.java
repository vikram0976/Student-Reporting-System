package com.pratice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Student {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer roll;
	
	private String name;
	private String address;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Marks marks;
	
}
