package com.toyproject.flatmate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.toyproject.flatmate.dao.ResidentDAO;
import com.toyproject.flatmate.dto.ResidentDTO;

@Controller
public class ResidentController1 {
	
	@Autowired
    private ResidentDAO residentDAO;

	@GetMapping("/flatmate")
    public String getResident(Model model) {
    	List<ResidentDTO> residentList = residentDAO.getResident_id();
        model.addAttribute("residentList", residentList);
        
        return "index";
    }
}
