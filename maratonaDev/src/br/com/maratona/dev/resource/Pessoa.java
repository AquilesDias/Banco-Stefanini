package br.com.maratona.dev.resource;

import java.util.ArrayList;
import java.util.List;

public class Pessoa { 
	
	private String nome;
	private Integer matricula;
	
	public Pessoa() {}
	
	public Pessoa(String nome, Integer matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	

}
