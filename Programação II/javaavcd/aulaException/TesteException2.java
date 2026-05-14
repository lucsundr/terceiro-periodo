package aulaException;

public class TesteException2 {
	public static void main(String[] args) {
		System.out.println("Início do método main");
		metodo1();
		System.out.println("Fim do método main");
	}

	private static void metodo1() {
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do método 1");		
	}

	private static void metodo2() {
		System.out.println("Início do método 2");
		int array[];
		array = new int[10];
		
		try {
			for (int i = 0; i < 20; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception pega (catched): "+e);
		}
		
		System.out.println("Fim do método 2");	
	}
}