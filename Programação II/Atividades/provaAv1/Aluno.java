package provaAv1;

import java.util.ArrayList;
import java.util.List;

public abstract class Aluno extends Pessoa {
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno() {}

    public Aluno(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
    }

    public void inscreverDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}