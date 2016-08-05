package models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Person {

	// VERSION 2	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String surname;
	private String last_name;
	
	public Person(int id, String name, String last_name){
		this.id = id;
		this.name = name;
		this.last_name = last_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**
	* If surname is null return last_name
	* otherwise return surname
	*/
	public String getSurname() {
		return surname != null ? surname : last_name;
	}

	/**
	* Setting both surname and last_name
	*/
	public void setSurname(String surname) {
		this.surname = surname;
		last_name = surname;
	}
}
