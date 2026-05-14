package provaAv1;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public Disciplina() {}

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
}