package com.pratice.models;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
