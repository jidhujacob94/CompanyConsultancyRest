package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.RegisterDTO;
import com.company.service.CanidateService;

@RestController
@RequestMapping("/api")
public class CompanyController {
	@Autowired
	private CanidateService service;

	@PostMapping("/company")
	public ResponseEntity<String> saveCanidates(@RequestBody RegisterDTO cm) {
		RegisterDTO reg = service.registerCanidate(cm);
		if (reg != null) {
			return new ResponseEntity<String>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Failed", HttpStatus.EXPECTATION_FAILED);
		}

	}

}
