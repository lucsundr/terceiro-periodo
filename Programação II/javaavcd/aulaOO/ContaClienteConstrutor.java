package aulaOO;

public class ContaClienteConstrutor {
	int agencia;
	int numero;
	Cliente cliente = new Cliente();
	double saldo;
	double limite;
	
	ContaClienteConstrutor(){
		System.out.println("Teste da classe com construtor.");
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
