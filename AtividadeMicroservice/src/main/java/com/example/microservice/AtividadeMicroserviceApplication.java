package com.example.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.microservice.model.Atividade;



@SpringBootApplication
public class AtividadeMicroserviceApplication {

	@GetMapping("/")
	public String get() {
		
		
		Atividade atividade = new Atividade();
//		atividade.setRm("82126");
//		atividade.setNome("Giulianno Zanetti");
//		atividade.setNumeroAtividade("4");
//		atividade.setUrlGitHub("https://github.com/Giuzntt/NAC-01---MICROSERVICE");
		
		
		
		return "Bem vindo a rest API. ";
	}

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(AtividadeMicroserviceApplication.class, args);
		
		
	}

}
