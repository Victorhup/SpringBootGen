package com.helloworld.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/hello")

public class HelloController {
    
	@GetMapping 
	public String hello () { 
		return "Hello pessoal!!! As mentalidades que eu usei nesse exercício foram: Persistência, atenção aos detalhes e gestão de tempo.";
		
	}
	
	
}
