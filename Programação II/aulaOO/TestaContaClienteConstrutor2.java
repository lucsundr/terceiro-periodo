package aulaOO;

public class TestaContaClienteConstrutor2 {

	public static void main(String[] args) {
		ContaClienteConstrutor2 cc2 = new ContaClienteConstrutor2("Jarbas","111.111.111-10");
//		cc2.cliente.nome = "Lucas Alves";
		System.out.println("O titular da conta cc2 é o: "+cc2.cliente.nome);
		System.out.println("O CPF do titular da conta cc2 é: "+cc2.cliente.cpf);
	}

}
