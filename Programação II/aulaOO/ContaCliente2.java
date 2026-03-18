package aulaOO;

public class ContaCliente2 {
	int agencia;
	int numero;
//	String nome;
	Cliente cliente = new Cliente();
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
