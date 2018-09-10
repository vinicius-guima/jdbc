package com.vinicius.contato.teste;

import java.util.Calendar;

import com.vinicius.contato.DAO.ContatoDao;
import com.vinicius.contato.modelo.Contato;

public class TestaInsere {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("NILTON");
		contato.setEmail("NILTON@UBER.com");
		contato.setEndereco("R: GUARULHOS 123");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("contato gravado!");
		
	}

}
