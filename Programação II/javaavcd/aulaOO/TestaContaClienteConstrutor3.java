package aulaOO;

public class TestaContaClienteConstrutor3 {

	public static void main(String[] args) {
		ContaClienteConstrutor3 cc31 = new ContaClienteConstrutor3("Jarbas","111.111.111-10");
		System.out.println("O titular da conta cc31 é o: "+cc31.cliente.nome);
		System.out.println("O CPF do titular da conta cc31 é: "+cc31.cliente.cpf);
//		int contador = ContaClienteConstrutor3.getContadorContas();
		System.out.println("Quantidade de clientes na base: "+ContaClienteConstrutor3.getContadorContas());
		
		System.out.println("===========================");
		ContaClienteConstrutor3 cc32 = new ContaClienteConstrutor3("Thiago","123.111.111-10");
		System.out.println("O titular da conta cc32 é o: "+cc32.cliente.nome);
		System.out.println("O CPF do titular da conta cc32 é: "+cc32.cliente.cpf);
//		contador = ContaClienteConstrutor3.getContadorContas();
		System.out.println("Quantidade de clientes na base: "+ContaClienteConstrutor3.getContadorContas());
		
		
		
		
	}

}
