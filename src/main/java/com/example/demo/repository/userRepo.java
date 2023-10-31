package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.employee;

@Component
public class userRepo {
	
	@Autowired
	HibernateTemplate ht;
	public employee findUserbyEmail(String email) {
		employee emp = ht.get(employee.class, email);
		return emp;
		
	}
	
	public void saveEmployee(employee emp) {
		ht.save(emp);
		
	}

}
