package com.vinicius.contato.teste;

import com.vinicius.contato.DAO.ContatoDao;
import com.vinicius.contato.modelo.Contato;

public class TesteRemove {
	
	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();
		
		contato.setId(1);
		
		dao.remove(contato);
		System.out.println("contato removido com sucesso!");
	}

}
