package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.employee;

import services.loginService;

@Controller
@RequestMapping
public class loginController {
	@Autowired
	loginService LoginService;
	
	@PostMapping("/login")
	public String validateLogin(String name, String password) {
		if(LoginService.validateUser(name, password)) {
			return "success";
		}
		return "invalid credentials";
	}
	@GetMapping("/addEmployee")
	public String  addEmp(employee emp)
	{
		LoginService.addEmployee(emp);
		return "success";
		
	}
	
	

}
