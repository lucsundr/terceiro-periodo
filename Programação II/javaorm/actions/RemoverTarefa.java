package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javaorm.model.Tarefa;

public class RemoverTarefa {

	public static void main(String[] args) {
		Tarefa tarefa2 = new Tarefa();
		tarefa2.setId(2L);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		tarefa2 = manager.find(Tarefa.class, tarefa2.getId());
		
		manager.getTransaction().begin();
		manager.remove(tarefa2);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa excluida com sucesso!!!");
		
		manager.close();
		factory.close();
	}

}
