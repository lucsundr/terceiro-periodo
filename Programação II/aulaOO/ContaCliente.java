package aulaOO;

public class ContaCliente {
	int agencia;
	int numero;
//	String nome;
	Cliente cliente;
	double saldo;
	double limite;
	
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
