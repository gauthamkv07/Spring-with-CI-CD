package com.example.swe645hw3.model;

import lombok.Data;

import jakarta.persistence.*;


@Entity
@Table(name="student_survey_form")
@Data
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "street_address")
	private String street_address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zip")
	private String zip;
	
	@Column(name = "telephone_number")
	private String telephone_number;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "survey_date")
	private String survey_date;
	
	@Column(name = "liked_most_about")
	private String liked_most_about;
	
	@Column(name = "interested_in")
	private String interested_in;
	
	@Column(name = "recommending_likelihood")
	private String recommending_likelihood;
}
