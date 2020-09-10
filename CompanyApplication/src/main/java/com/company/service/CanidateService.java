package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.model.CompanyDTO;
import com.company.model.RegisterDTO;
import com.company.repository.CompanyRepository;

@Service
public class CanidateService {
	@Autowired
	private CompanyRepository repository;

	public RegisterDTO registerCanidate(RegisterDTO rg) {
		CompanyDTO comp = new CompanyDTO();
		comp.setCanidate_id(rg.getSid());
		comp.setCanidate_name(rg.getName());
		comp.setCanidate_age(rg.getAge());
		comp.setCanidate_address(rg.getAddress());
		comp.setCanidate_phone(rg.getPhone());

		repository.save(comp);
		return null;
	}

}
