package com.consultency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.consultency.model.RegisterDTO; 
import com.consultency.service.ConsultencyRegisterService;
@RestController

public class ConsultencyController {
	
	@Autowired
	private ConsultencyRegisterService Conservice;

	
	 @RequestMapping(value = "/register", method = RequestMethod.POST) 
	 public  ResponseEntity<String> employeePay(@RequestBody RegisterDTO reg) 
	 { 
		 String s = Conservice.register(reg);
		 return new ResponseEntity<String>(s,HttpStatus.OK);
	
}
}