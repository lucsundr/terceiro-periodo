package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javaorm.model.Tarefa;

public class AtualizarTarefa {
	public static void main(String[] args) {
		Tarefa tarefa2 = new Tarefa();
		tarefa2.setId(3L);
		tarefa2.setDescricao("Estudar muuuuuuuito Java, pois a prova será muuuuito dificil!");
		tarefa2.setFinalizado(false);
		tarefa2.setDataFinalizacao(null);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		//minha operação: neste caso alterar o objeto (U do CRUD), que um hibernato é: merge
		manager.merge(tarefa2);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa atualizada, ID: "+tarefa2.getId());
		
		manager.close();
		factory.close();
	}

}
