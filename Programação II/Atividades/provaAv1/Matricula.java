package provaAv1;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private double frequencia;

    public Matricula() {}

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    
    //Prompt: pegue de base o arquivo Funcionario.java e modifique-o baseado nos requisitos, colocando seus getters
    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
}