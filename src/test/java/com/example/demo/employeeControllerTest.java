package com.example.demo;

import java.util.List;

import org.apache.el.stream.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebMycTest(controllers = employeeController.class)
public class employeeControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@MockBean
	private employeeService service;
	
	private List<employee> employees;
	
	private Optional<employee> empById;
	
	private employee empupdate;
	
	@BeforeEach
	void setUp() {
		employees = List.of(new employee("52631456","E1","Ravi","Kumar",2000));
		emp = new employee("123456","E1","Ravi","Kumar",2000);
		empById = Optional.of(new employee("123456","E3","Ravi","Kumar",2000));
	}

}
