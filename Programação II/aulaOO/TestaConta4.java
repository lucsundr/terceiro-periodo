package aulaOO;

public class TestaConta4 {
	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta();
		c1.saldo = 100;
		
		System.out.println("Saldo de c1: "+c1.saldo);
//		System.out.println("Saldo de c2: "+c2.saldo); -> dá erro, c2 ainda não existe nesta linha
		
		Conta c2;
//		c2 = new Conta();
		c2 = c1;
		c2.saldo = 200;
		System.out.println("Saldo de c1: "+c1.saldo);
		System.out.println("Saldo de c2: "+c2.saldo);
		
		int i = 10;
		System.out.println(i);
		
		int j = 12;
		System.out.println(j);
		
		j = i;
		
		System.out.println(j);
		
		
		
	}

}
