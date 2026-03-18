package aulaOO;

public class TestaContaClienteConstrutor {

	public static void main(String[] args) {
		ContaClienteConstrutor cc = new ContaClienteConstrutor();
		cc.cliente.nome = "Lucas Alves";
		System.out.println("O titular da conta cc é o: "+cc.cliente.nome);
	}

}
