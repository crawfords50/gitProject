package com.gitProject.model;

/* Use java.util.Date so Spring will automatically be able to parse the date strings from the view */

//import java.sql.Date;
import javax.persistence.Entity;

@Entity
//@Table(name = "PERSONS")
public class Person {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;

	private int originalPersonID;

	private int aaPersonID;

}
