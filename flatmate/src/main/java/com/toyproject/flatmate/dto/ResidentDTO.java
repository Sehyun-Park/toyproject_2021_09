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
}