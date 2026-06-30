package apps;

import java.sql.SQLException;
import java.util.List;
import dao.ContatoDao;
import model.Contato;

public class TestaDaoGetLista {
	public static void main(String[] args) {
		try {
			ContatoDao contatoDao = new ContatoDao ();
			List<Contato> contatos = contatoDao.getLista();
			for (Contato contato : contatos) {
				System.out.println("============================");
				System.out.println("Nome do contato >> "+contato.getNome());
				System.out.println("E-mail do contato >> "+contato.getEmail());
				System.out.println("Endereço do contato >> "+contato.getEndereco());
				System.out.println("============================");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
