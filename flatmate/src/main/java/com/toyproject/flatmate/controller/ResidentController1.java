package com.toyproject.flatmate.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@GetMapping("/in0")
	public ModelAndView Testin0() {
		
		List<ResidentDTO> residentList = residentDAO.getKim_id();
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		mv.addObject("residentList", residentList);
		
		return mv;
	}
	
	@GetMapping("/chat")
	public ModelAndView chat(Locale locale) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("chat");
		
		return mv;
	}
	
}
