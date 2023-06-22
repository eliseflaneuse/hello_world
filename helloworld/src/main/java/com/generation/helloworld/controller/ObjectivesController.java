package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.lang.StringBuilder;

@RestController
@RequestMapping("/objectives")
public class ObjectivesController {

	 @GetMapping
	    public String getObjectives() {
		 
		String intro = "Developer's Log, earthdate 2023.06.22.\nMeus objetivos de aprendizagem desta semana são: \n";
		 	
	        List<String> objectives = Arrays.asList(
	            "Ecossistema Spring",
	            "Revisão da Linguagem Java",
	            "mySQL Models"
	        );
	        
	        StringBuilder markdownList = new StringBuilder();
	        for (String objective : objectives) {
	            markdownList.append("- ").append(objective).append("\n");
	        }
	        
	        return intro + markdownList.toString();
	    }
    
}

