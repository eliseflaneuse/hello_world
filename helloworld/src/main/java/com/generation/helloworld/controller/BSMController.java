package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bsms")
public class BSMController {

	@GetMapping
	public Map<String, Object> getBSMs() {
	    Map<String, Object> bsmMap = new LinkedHashMap<>();
	    
	    String intro = "Essas são as BSM's da Generation Brasil agrupadas em um objeto: ";
	    
	    List<String> mentalidades = Arrays.asList(
	        "Responsabilidade pessoal",
	        "Mentalidade de crescimento",
	        "Orientação ao futuro",
	        "Persistência"
	    );
	    List<String> habilidades = Arrays.asList(
	        "Comunicação",
	        "Orientação aos Detalhes",
	        "Trabalho em equipe",
	        "Proatividade"
	    );
	    
	    bsmMap.put("Intro", intro);
	    bsmMap.put("MENTALIDADES", mentalidades);
	    bsmMap.put("HABILIDADES", habilidades);
	    return bsmMap;
	}

}
