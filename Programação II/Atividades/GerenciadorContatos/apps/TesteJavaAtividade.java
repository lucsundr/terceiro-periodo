package apps;

import dao.ContatoDao;
import model.Contato;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TesteJavaAtividade {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		ContatoDao dao = new ContatoDao();
		int opcao;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Adicionar cadastro");
			System.out.println("2 - Listar cadastros");
			System.out.println("3 - Pesquisar por letra");
			System.out.println("4 - Pesquisar por ID");
			System.out.println("5 - Alterar cadastro");
			System.out.println("6 - Remover cadastro");
			System.out.println("0 - Sair");
			System.out.print("Opcao: ");

			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			

			case 1:
				Contato p = new Contato();

				System.out.print("Nome: ");
				p.setNome(sc.nextLine());

				System.out.print("Email: ");
				p.setEmail(sc.nextLine());

				System.out.print("Endereco: ");
				p.setEndereco(sc.nextLine());

				dao.adiciona(p);
				System.out.println("Cadastro realizado!");
				break;
				
			case 2:
				List<Contato> lista = dao.getLista();

				for (Contato prod : lista) {
					System.out.println("Id do Contato: " + prod.getId());
					System.out.println("Nome do Contato: " + prod.getNome());
					System.out.println("Email do Contato: " + prod.getEmail());
					System.out.println("Endereço do Contato: " + prod.getEndereco());
					System.out.println();
				}
				break;
				
			case 3:

			    System.out.print("Digite a letra inicial: ");
			    String letra = sc.nextLine();

			    List<Contato> contatos = dao.pesquisarInicial(letra);

			    if (contatos.isEmpty()) {
			        System.out.println("Nenhum contato encontrado.");
			    } else {
			        for (Contato c : contatos) {
			            System.out.println("Id do Contato: " + c.getId());
			            System.out.println("Nome do Contato: " + c.getNome());
			            System.out.println("Email do Contato: " + c.getEmail());
			            System.out.println("Endereço do Contato: " + c.getEndereco());
			            System.out.println();
			        }
			    }

			    break;

			case 4:
				System.out.print("ID: ");
				Contato encontrado = dao.pesquisar(sc.nextInt());

				if (encontrado != null) {
					System.out.println("Id do Contato: " + encontrado.getId());
					System.out.println("Nome do Contato: " + encontrado.getNome());
					System.out.println("Email do Contato: " + encontrado.getEmail());
					System.out.println("Endereço do Contato: " + encontrado.getEndereco());
					System.out.println();
				} else {
					System.out.println("Cadastro nao encontrado.");
				}
				break;

			case 5:
				System.out.print("ID: ");
				Contato alterar = dao.pesquisar(sc.nextInt());

				if (alterar == null) {
					System.out.println("Cadastro nao encontrado.");
					break;
				}

				sc.nextLine();

				System.out.print("Novo nome: ");
				alterar.setNome(sc.nextLine());

				System.out.print("Novo email: ");
				alterar.setEmail(sc.nextLine());

				System.out.print("Novo endereco: ");
				alterar.setEndereco(sc.nextLine());

				dao.altera(alterar);
				System.out.println("Cadastro alterado!");
				break;

			case 6:
				System.out.print("ID: ");
				dao.remove(sc.nextInt());
				System.out.println("Cadastro removido!");
				break;

			case 0:
				System.out.println("Encerrando...");
				break;

			default:
				System.out.println("Opcao invalida!");
			}

		} while (opcao != 0);

		sc.close();
	}
}