package com.toyproject.flatmate.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResidentDTO {
	String resident_id;
	String resident_password;
	String resident_name;
	String resident_address;
	String resident_phone;
	String resident_birth;
	String resident_gender;
	String resident_email;
	String apt_code;
	Date resident_date;
//	public String getResident_id() {
//		return resident_id;
//	}
//	public void setResident_id(String resident_id) {
//		this.resident_id = resident_id;
//	}
//	public String getResident_password() {
//		return resident_password;
//	}
//	public void setResident_password(String resident_password) {
//		this.resident_password = resident_password;
//	}
//	public String getResident_name() {
//		return resident_name;
//	}
//	public void setResident_name(String resident_name) {
//		this.resident_name = resident_name;
//	}
//	public String getResident_address() {
//		return resident_address;
//	}
//	public void setResident_address(String resident_address) {
//		this.resident_address = resident_address;
//	}
//	public String getResident_phone() {
//		return resident_phone;
//	}
//	public void setResident_phone(String resident_phone) {
//		this.resident_phone = resident_phone;
//	}
//	public String getResident_birth() {
//		return resident_birth;
//	}
//	public void setResident_birth(String resident_birth) {
//		this.resident_birth = resident_birth;
//	}
//	public String getResident_gender() {
//		return resident_gender;
//	}
//	public void setResident_gender(String resident_gender) {
//		this.resident_gender = resident_gender;
//	}
//	public String getResident_email() {
//		return resident_email;
//	}
//	public void setResident_email(String resident_email) {
//		this.resident_email = resident_email;
//	}
//	public String getApt_code() {
//		return apt_code;
//	}
//	public void setApt_code(String apt_code) {
//		this.apt_code = apt_code;
//	}
//	public Date getResident_date() {
//		return resident_date;
//	}
//	public void setResident_date(Date resident_date) {
//		this.resident_date = resident_date;
//	}
	
	
	
}