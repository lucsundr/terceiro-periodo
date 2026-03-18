package estruturasdecontrole;

public class InterrupcaoBreak2 {

	public static void main(String[] args) {
		int[][] numeros = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int numeroPesquisa = 5;
		boolean numeroEncontrado = false;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(i);
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println(j);
				if (numeroPesquisa == numeros[i][j]) {
					numeroEncontrado = true;
					break;
				}
			}
		}
		
		System.out.println("Outro looping");
		
		rotuloPesquisa: for (int i = 0; i < numeros.length; i++) {
			System.out.print(i);
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println(j);
				if (numeroPesquisa == numeros[i][j]) {
					numeroEncontrado = true;
					break rotuloPesquisa;
				}
			}
		}
		
		
		if (numeroEncontrado) {
			System.out.println("Parabéns, você encontrou o número: "+numeroPesquisa);
		} else {
			System.out.println("Infelizmente o número "+numeroPesquisa+" não foi encontrado!");
		}


	}

}
