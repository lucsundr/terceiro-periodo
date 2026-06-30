package apps;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.ContatoDao;
import model.Contato;

public class TesteDaoScanner2 {
    public static void main(String[] args) {

        try {
            String nome = JOptionPane.showInputDialog("Digite o nome:");

            String email = JOptionPane.showInputDialog("Digite o e-mail:");

            String endereco = JOptionPane.showInputDialog("Digite o endereço:");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setEndereco(endereco);

            ContatoDao dao = new ContatoDao();
            dao.adiciona(contato);

            JOptionPane.showMessageDialog(
                null,
                "Contato cadastrado com sucesso!! \\o/",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE
            );

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                null,
                "Erro ao gravar no banco de dados.\n" + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
            e.printStackTrace();
        }
    }
}