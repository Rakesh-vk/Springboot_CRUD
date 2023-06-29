package com.git.CRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String first_name;
	private String last_name;
	private String email;
	public User(int i, String fname, String lname, String email) {
		this.first_name=fname;
		this.last_name=lname;
		this.email=email;
		this.id=id;
	}
	public Long getId() {
		return id;
	}
	public User() {
		super();
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
