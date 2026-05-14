package provaAv1;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor() {}

    public Professor(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void lancarNota(Avaliacao avaliacao, double nota) {
        avaliacao.setNota(nota);
    }

    public void lancarFrequencia(Matricula matricula, double frequencia) {
        matricula.setFrequencia(frequencia);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}