package aulaOO;

public class ContaClienteConstrutor3 {
	private static int contadorContas; //atributa de classe, como se fosse um contador global
	int agencia;
	int numero;
	Cliente cliente = new Cliente();
	double saldo;
	double limite;
	
	ContaClienteConstrutor3(String nome, String cpf){
		System.out.println("Teste da classe com construtor.");
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		ContaClienteConstrutor3.contadorContas++;
	}
	
	public static int getContadorContas() {
		return ContaClienteConstrutor3.contadorContas;
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
