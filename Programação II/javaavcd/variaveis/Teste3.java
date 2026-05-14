package variaveis;

public class Teste3 {
	public static void main(String[] args) {
		int i = 10;	
		int j = 5;
		int k = ++j + i; //pré incremento: primeiro incrementa e depois opera
		System.out.println(k);
		
		int m = 10;
		int n = 5;
		int p = m++ + n;
		System.out.println(p); //pós incremento: primeiro opera e depois incrementa
		
		/*
		 * Operadores relacionais: comparam logicamente duas variáveis (retornam 
		 * true ou false):
		 * > maior que
		 * >= maior ou igual
		 * < menor que
		 * <= menor ou igual
		 * == igual
		 * != não é igual
		 */
		
		/*
		 * Operadores lógicos: serve para operar variáveis lógicas
		 * AND (& ou &&)
		 * true AND true => true
		 * true AND false => false
		 * false AND true => false
		 * false AND false => false
		 * 
		 * OR (| ou ||)
		 * true OR true => true
		 * true OR false => true
		 * false OR true => true
		 * false OR false => false
		 * 
		 * negação !
		 * !true = false
		 * !false = true
		 * 
		 */
	}

}
