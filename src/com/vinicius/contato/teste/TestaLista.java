package com.vinicius.contato.teste;

import java.util.List;

import com.vinicius.contato.DAO.ContatoDao;
import com.vinicius.contato.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {

		ContatoDao dao = new ContatoDao();

		List<Contato> contatos = dao.getLista();
		

			for (Contato contato : contatos) {
				System.out.println("nome: " + contato.getNome());
				System.out.println("Email: " + contato.getEmail());
				System.out.println("Edereço: " + contato.getEndereco());
				System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
			}
		}
	
}
