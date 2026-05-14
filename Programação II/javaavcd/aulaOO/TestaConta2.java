package aulaOO;

public class TestaConta2 {
	public static void main(String[] args) {
		
		Conta2 c2 = new Conta2(); //declaração e instanciação na mesma linha
		
		c2.agencia = 010;
		c2.numero = 001;
		c2.nome = "Clayton";
		c2.saldo = 2000.00;
		c2.limite = 10000.00;
		
		System.out.println("===============================");
		System.out.println("Número da conta: "+c2.numero);
		System.out.println("Titular: "+c2.nome);
		System.out.println("Saldo atual: "+c2.saldo);
		System.out.println("Limite: "+c2.limite);

		double valorSaque = 800;
		boolean resultado = c2.sacar(valorSaque);
		if (resultado) {
			System.out.println("Você sacou R$"+valorSaque+" e seu saldo atual é R$"+c2.saldo);
		} else {
			System.out.println("Saque NÃO efetuado, valor acima do possível");
		}
		
		
		System.out.println("Saldo atual: "+c2.saldo);
		
	}

}
