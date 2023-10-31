package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.employee;
import com.example.demo.repository.userRepo;

@Service
public class loginService {
	@Autowired
	userRepo UserRepo;
	public Boolean validateUser(String email, String password) {
		employee e = UserRepo.findUserbyEmail(email);
		if(e.getEmail()!=null) {
			if(e.getPassword()==password) {
				return true;
			}
		}
		return false;
	}

	public void addEmployee(employee emp) {
		UserRepo.saveEmployee(emp);
	}

}
