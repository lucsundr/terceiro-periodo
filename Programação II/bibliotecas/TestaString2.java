package bibliotecas;

public class TestaString2 {
	public static void main(String[] args) {
		String a = new String ("Venha aprender Java no Senac");
		String b = new String ("Venha aprender Java no senac");
		
		if (a == b) {
			System.out.println("a e b são iguais");
		} else {
			System.out.println("a e b são diferentes");
		}

	}

}
