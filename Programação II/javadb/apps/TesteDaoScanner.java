package apps;

import java.sql.SQLException;
import java.util.Scanner;
import dao.ContatoDao;
import model.Contato;

public class TesteDaoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite o e-mail: ");
            String email = sc.nextLine();

            System.out.print("Digite o endereço: ");
            String endereco = sc.nextLine();

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setEndereco(endereco);

            ContatoDao dao = new ContatoDao();
            dao.adiciona(contato);

            System.out.println("Contato cadastrado com sucesso!! \\o/");

        } catch (SQLException e) {
            System.out.println("Erro ao gravar no banco de dados.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
