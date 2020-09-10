package com.company.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CompanyData")
public class CompanyDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int canidate_id;
	private String canidate_name;
	private String canidate_address;
	private String canidate_age;
	private int canidate_phone;
	private String canidate_qualifications;

	public int getCanidate_id() {
		return canidate_id;
	}

	public void setCanidate_id(int canidate_id) {
		this.canidate_id = canidate_id;
	}

	public String getCanidate_qualifications() {
		return canidate_qualifications;
	}

	public void setCanidate_qualifications(String canidate_qualifications) {
		this.canidate_qualifications = canidate_qualifications;
	}

	public String getCanidate_name() {
		return canidate_name;
	}

	public void setCanidate_name(String canidate_name) {
		this.canidate_name = canidate_name;
	}

	public String getCanidate_address() {
		return canidate_address;
	}

	public void setCanidate_address(String canidate_address) {
		this.canidate_address = canidate_address;
	}

	public String getCanidate_age() {
		return canidate_age;
	}

	public void setCanidate_age(String canidate_age) {
		this.canidate_age = canidate_age;
	}

	public int getCanidate_phone() {
		return canidate_phone;
	}

	public void setCanidate_phone(int canidate_phone) {
		this.canidate_phone = canidate_phone;
	}

}
