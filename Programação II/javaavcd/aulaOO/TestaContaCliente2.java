package aulaOO;

public class TestaContaCliente2 {

	public static void main(String[] args) {
		ContaCliente2 cc2 = new ContaCliente2();
//		Cliente cliente2 = new Cliente();
//		cc1.cliente = cliente2;
		cc2.cliente.nome = "Lucas Alves";
		System.out.println("O titular da conta cc2 é o: "+cc2.cliente.nome);
	}

}
