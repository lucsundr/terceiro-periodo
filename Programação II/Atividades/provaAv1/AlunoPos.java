package provaAv1;

public class AlunoPos extends Aluno {
    private int moduloAtual;
    private TCC tcc;

    public AlunoPos() {}

    public AlunoPos(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
        this.moduloAtual = 1;
        this.tcc = new TCC();
    }

    public int getModuloAtual() { return moduloAtual; }
    public void setModuloAtual(int moduloAtual) { this.moduloAtual = moduloAtual; }

    public TCC getTcc() { return tcc; }
}