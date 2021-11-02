package com.example.microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "atividade")
public class Atividade {

	@Id
	private String id;
	
	
	public String rm; 
	public String nome;
	public String urlGitHub;
	public String numeroAtividade;
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrlGitHub() {
		return urlGitHub;
	}
	public void setUrlGitHub(String urlGitHub) {
		this.urlGitHub = urlGitHub;
	}
	public String getNumeroAtividade() {
		return numeroAtividade;
	}
	public void setNumeroAtividade(String numeroAtividade) {
		this.numeroAtividade = numeroAtividade;
	}
	
	

	
	
}

