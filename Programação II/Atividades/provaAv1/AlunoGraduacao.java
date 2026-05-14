package provaAv1;

public class AlunoGraduacao extends Aluno {
    private int semestreAtual;
    private ProjetoInt projetoIntegrador;

    public AlunoGraduacao() {}

    public AlunoGraduacao(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
        this.semestreAtual = 1;
        this.projetoIntegrador = new ProjetoInt();
    }

    public int getSemestreAtual() { return semestreAtual; }
    public void setSemestreAtual(int semestreAtual) { this.semestreAtual = semestreAtual; }

    public ProjetoInt getProjetoIntegrador() {
        return projetoIntegrador;
    }
}