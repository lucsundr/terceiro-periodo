package aulaArrays;

public class TesteArray1 {
	public static void main(String[] args) {
		//declaração do array
		@SuppressWarnings("unused")
		int notas[]; //também pode ser assim: int[] notas;
		
		//construção do array
		notas = new int[100];
		
		//ou declaração e construção na mesma linha
		@SuppressWarnings("unused")
		int notas2[] = new int[100];
		
		//ou você pode também construir e inicializar na mesma linha
		int notas3[] = {5, 6, 7, 8, 9};
		
		@SuppressWarnings("unused")
		boolean resultados[] = {true, false, true, true};
		
		@SuppressWarnings("unused")
		String diasDaSemana[] = {"seg","ter","qua","qui","sex","sab","dom"};
		System.out.println("A terceira nota foi: "+notas3[2]);
		
	}

}
