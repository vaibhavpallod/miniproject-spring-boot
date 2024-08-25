package com.miniproject.CollegeNetwork.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	@Column
	@Id
	private int id;

	@Column
	private String password;

	public int getId() {
		return id;
	}

	public Login() {
		super();
	}

	public Login(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}