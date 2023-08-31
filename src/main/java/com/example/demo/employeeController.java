package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {
	
	@Autowired
	public employeeService service;
	
	@PostMapping("/employee")
	public employee createEmployee(@Validated @RequestBody employee emp) {
		return service.create(emp);
	}
	@GetMapping("/employees")
	public List<employee> getAllEmployees(){
		return service.getAll();
	}
	
	@GetMapping ("/employee/{id}")
	public Optional<employee> getEmployeeById(@PathVariable String id){
		return service.getById(id);
	}
	
	@PutMapping("/employee/{id}")
	public employee updateEmployee(@PathVariable String id, @Validated @RequestBody employee emp) {
		return service.update(id, emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable String id) {
		service.delete(id);
		return "Employee with id :" + id + "deleted succesfully.";
	}
}
