package com.objetivos.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/objetivos")
public class ObjetivoController { 
	@GetMapping 
	public String objetivo () {
		return "Os objetivos que eu quero para essa semana são: Absorver todo conteudo de Spring Boot e me aperfeiçoar mais";
	}

}
