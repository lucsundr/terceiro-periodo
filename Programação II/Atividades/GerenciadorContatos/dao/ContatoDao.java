package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javadb.ConnectionFactory;
import model.Contato;

public class ContatoDao {

    private Connection con;

    public ContatoDao() throws SQLException {
        this.con = ConnectionFactory.getConnection();
    }

    public void adiciona(Contato p) throws SQLException {

        String sql =
            "insert into contatos (nome, email, endereco) values (?, ?, ?)";

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getEmail());
        stmt.setString(3, p.getEndereco());

        stmt.execute();
        stmt.close();
    }

    public List<Contato> getLista() throws SQLException {

        String sql = "select * from contatos";

        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        List<Contato> lista = new ArrayList<>();

        while (rs.next()) {

        	Contato p = new Contato();

            p.setId(rs.getLong("id"));
            p.setNome(rs.getString("nome"));
            p.setEmail(rs.getString("email"));
            p.setEndereco(rs.getString("endereco"));

            lista.add(p);
        }

        rs.close();
        stmt.close();

        return lista;
    }

    public Contato pesquisar(int id) throws SQLException {

        String sql = "select * from contatos where id = ?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = stmt.executeQuery();

        Contato p = null;

        if (rs.next()) {

            p = new Contato();

            p.setId(rs.getLong("id"));
            p.setNome(rs.getString("nome"));
            p.setEmail(rs.getString("email"));
            p.setEndereco(rs.getString("endereco"));
        }

        rs.close();
        stmt.close();

        return p;
    }
    
    public List<Contato> pesquisarInicial(String letra) throws SQLException {

        String sql = "select * from contatos where nome like ?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, letra + "%");

        ResultSet rs = stmt.executeQuery();

        List<Contato> lista = new ArrayList<>();

        while (rs.next()) {

            Contato p = new Contato();

            p.setId(rs.getLong("id"));
            p.setNome(rs.getString("nome"));
            p.setEmail(rs.getString("email"));
            p.setEndereco(rs.getString("endereco"));

            lista.add(p);
        }

        rs.close();
        stmt.close();

        return lista;
    }

    public void altera(Contato p) throws SQLException {

        String sql =
            "update contatos set nome=?, email=?, endereco=? where id=?";

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getEmail());
        stmt.setString(3, p.getEndereco());
        stmt.setLong(4, p.getId());

        stmt.execute();
        stmt.close();
    }

    public void remove(int id) throws SQLException {

        String sql = "delete from contatos where id=?";

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();
    }
}