package com.consultency.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consultency.model.RegisterDTO;

@Service
public class ConsultencyRegisterService {

	public String register(RegisterDTO reg) {
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8051/api/company";
		String status = template.postForObject(url, reg, String.class);
		return status;
	}

}
