package com.easyPoint.teste.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.easyPoint.teste.modelo.Usuario;

public class SalvaDados {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Usuario usuario = new Usuario();
		
		usuario.setNome("Tiago Jose da Silva");
		usuario.setEmail("tiagoj101@terra.com.br");
		usuario.setSenha("3333331");

		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();

		System.out.println("Usuario salvo com sucesso");
	}
}
