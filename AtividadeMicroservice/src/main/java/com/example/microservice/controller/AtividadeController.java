package com.example.microservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.microservice.Repository.AtividadeRepository;
import com.example.microservice.model.Atividade;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

	@Autowired
	private AtividadeRepository atividadeRepository;

	
	@PostMapping()
	public ResponseEntity<Atividade> post(@RequestBody Atividade model) {

		Atividade atividade = atividadeRepository.save(model);

		return new ResponseEntity<>(atividade, HttpStatus.CREATED);
	}

	@GetMapping()
	public List<Atividade> getAll() {
		return atividadeRepository.findAll();
	}

}
