package com.toyproject.flatmate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toyproject.flatmate.dao.ResidentDAO;
import com.toyproject.flatmate.dto.ResidentDTO;

@RestController
@RequestMapping("/resident")
public class AjaxController {
	
	@Autowired
    private ResidentDAO residentDAO;

    @GetMapping("/id")
    public List<ResidentDTO> HelloWorld() {
        return residentDAO.getResident_id();
    }
    
    
    
}
