package actions;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javaorm.model.Tarefa;

public class InserirTarefa {
	public static void main(String[] args) {
		//Tarefa tarefa1 = new Tarefa();
		//tarefa1.setDescricao("Estudar para a prova de Estatística");
		//tarefa1.setFinalizado(false);
		//tarefa1.setDataFinalizacao(null);
		
		Tarefa tarefa2 = new Tarefa();
		tarefa2.setDescricao("Estudar para a prova de Java");
		tarefa2.setFinalizado(false);
		tarefa2.setDataFinalizacao(Calendar.getInstance());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(tarefa2);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa inserida, ID: "+tarefa2.getId());
		
		manager.close();
		factory.close();
	}

}
