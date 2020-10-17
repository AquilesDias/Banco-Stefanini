package br.com.maratona.dev.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class InscricaoHelper {
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void init() {
		pessoas.add(new Pessoa("aqules", 123));
		pessoas.add(new Pessoa("tauani", 431));
	}
	
	public Pessoa findPessoa(Integer id) {
		init();
		for (Pessoa indice : pessoas) {
			if (indice.getMatricula().equals(new Integer(id))) {
				return indice;
			}
		}
		return null;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
		
}
