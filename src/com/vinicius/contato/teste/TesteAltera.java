package com.vinicius.contato.teste;

import java.util.Calendar;

import com.vinicius.contato.DAO.ContatoDao;
import com.vinicius.contato.modelo.Contato;

public class TesteAltera {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();
		
		contato.setNome("Cesar Guima");
		contato.setEmail("security@hotmail");
		contato.setEndereco("Transalarm");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId(2);
		
		dao.altera(contato);
		System.out.println("contato alterado!");
	}

}
