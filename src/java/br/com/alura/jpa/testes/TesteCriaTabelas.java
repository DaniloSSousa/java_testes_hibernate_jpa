package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TesteCriaTabelas {
  public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
	EntityManager em = emf.createEntityManager();
	
	Conta c = new Conta();
	c.setAgencia(123);
	c.setNumero(321);
	c.setTitular("Maria");
	c.setSaldo(5000.0);
	
//	Conta c2 = new Conta();
//	c2.setAgencia(012);
//	c2.setNumero(210);
//	c2.setTitular("Pedro");
//	c2.setSaldo(3000.0);
	
//	Conta c = em.find(Conta.class, 2L);
	
	em.getTransaction().begin();
	em.persist(c);
	em.getTransaction().commit();
	em.close();
	
//	c.setSaldo(4000.0);
	
//	System.out.println(Conta.class + "\n" + c.getClass());

//	EntityManager em2 = emf.createEntityManager();
	
//	em2.getTransaction().begin();
//	em2.merge(c);
//	em.persist(c);
//	em2.getTransaction().commit();
  }
}
