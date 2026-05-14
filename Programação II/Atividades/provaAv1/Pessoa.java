package provaAv1;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String matricula;
    private String telefone;
    private String email;
    private String endereco;

    public Pessoa() {}

    public Pessoa(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    //Prompt: pegue de base o arquivo Funcionario.java e modifique-o baseado nos requisitos, colocando seus getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}