package aulaOO;

public class TestaConta5 {
	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta();
		c1.nome = "Thiago";
		
		Conta c2;
		c2 = new Conta();
		c2.nome = "Thiago";
		
		if (c1 == c2) { //ele compara o hash de memória, por isso dá diferente
			System.out.println("As contas são iguais");
		} else {
			System.out.println("As contas são diferentes");
		}
		
		
		
		
		
	}

}
