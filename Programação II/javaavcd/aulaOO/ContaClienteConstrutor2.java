package aulaOO;

public class ContaClienteConstrutor2 {
	int agencia;
	int numero;
	Cliente cliente = new Cliente();
	double saldo;
	double limite;
	
	ContaClienteConstrutor2(String nome, String cpf){
		System.out.println("Teste da classe com construtor.");
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
	}
	
	boolean sacar(double valor){
	if	((this.saldo+this.limite) < valor) {
		return false;
	} else {
		this.saldo = this.saldo - valor;
		return true;
	}
		
		
		
	}
	
	void depositar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	

}
