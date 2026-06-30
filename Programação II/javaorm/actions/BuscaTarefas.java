package actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import javaorm.model.Tarefa;

public class BuscaTarefas {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		//DAO -> "select...?"
		//JPQL -> :param
		
		String sqlJPQL = "select t from Tarefa as t where t.finalizado = :paramFinalizado";
		
		//JPQL: classe Query de "javax.persistence"
		Query query =  manager.createQuery(sqlJPQL);
		query.setParameter("paramFinalizado", false);
		
		@SuppressWarnings("unchecked")
		List<Tarefa> lista = query.getResultList();
		
		for (Tarefa t : lista) {
			System.out.println(t.getDescricao());
		}
		
		manager.close();
		factory.close();
	}

}
