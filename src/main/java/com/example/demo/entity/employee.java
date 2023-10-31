package com.example.demo.entity;

import javax.persistence.*;
@Table(name = "employeeDetails")
@Entity
public class employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
