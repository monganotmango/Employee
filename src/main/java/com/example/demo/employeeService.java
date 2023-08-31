package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeService {
	
	@Autowired
	public employeeRepository empRepo;
	
	public employee create(employee emp) {
		return empRepo.save(emp);
	}
	public List<employee> getAll(){
		return empRepo.findAll();
	}
	public Optional<employee> getById(String id){
		return empRepo.findById(id);
	}
	
	public employee update(String id, employee emp) {
		emp.setId(id);
		return empRepo.save(emp);
	}
	
	public String delete(String id) {
		empRepo.deleteById(id);
		return "Employee with id :" +id+ "deleted successfully.";
	}
}
