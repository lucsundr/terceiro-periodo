package provaAv1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Professor prof = new Professor(
                "Ana Lima", "22233344455", "PROF02",
                "11911111111", "ana@email.com", "Rua D"
        );

        Disciplina disciplina = new Disciplina("Banco de Dados");
        prof.adicionarDisciplina(disciplina);

        Avaliacao prova = new Avaliacao("Prova Final");
        Avaliacao trabalho = new Avaliacao("Projeto");

        disciplina.adicionarAvaliacao(prova);
        disciplina.adicionarAvaliacao(trabalho);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new AlunoGraduacao(
                "Lucas", "11111111111", "2023002",
                "11922222222", "lucas@email.com", "Rua E"
        ));

        alunos.add(new AlunoGraduacao(
                "Fernanda", "22222222222", "2023003",
                "11933333333", "fernanda@email.com", "Rua F"
        ));

        alunos.add(new AlunoPos(
                "Ricardo", "33333333333", "2024002",
                "11944444444", "ricardo@email.com", "Rua G"
        ));

        List<Matricula> matriculas = new ArrayList<>();

        for (Aluno aluno : alunos) {
            aluno.inscreverDisciplina(disciplina);
            Matricula m = new Matricula(aluno, disciplina);
            matriculas.add(m);
        }

        prof.lancarNota(prova, 7.5);
        prof.lancarNota(trabalho, 8.0);

        double freq = 80.0;
        for (Matricula m : matriculas) {
            prof.lancarFrequencia(m, freq);
            freq += 5;
        }

        System.out.println("\n===== RELATÓRIO DA DISCIPLINA =====");

        for (Matricula m : matriculas) {
            Aluno aluno = m.getAluno();

            double media = (prova.getNota() + trabalho.getNota()) / 2;

            System.out.println("\nAluno: " + aluno.getNome());
            System.out.println("Média: " + media);
            System.out.println("Frequência: " + m.getFrequencia() + "%");

            if (media >= 7 && m.getFrequencia() >= 75) {
                System.out.println("Situação: APROVADO");
            } else {
                System.out.println("Situação: REPROVADO");
            }
        }

        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoGraduacao) {
                ((AlunoGraduacao) aluno).getProjetoIntegrador().setTema("Projeto XPTO");
                System.out.println("\n" + aluno.getNome() + " tem Projeto Integrador.");
            } else if (aluno instanceof AlunoPos) {
                ((AlunoPos) aluno).getTcc().setTitulo("TCC Avançado");
                System.out.println("\n" + aluno.getNome() + " tem TCC.");
            }
        }
    }
}

//Prompt: Crie um arquivo main baseado em todos os arquivos java enviados