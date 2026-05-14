package estruturasdecontrole;

public class Decisao3 {
	public static void main(String[] args) {
		int nota = 60;

		if (nota >= 90) {
			System.out.println("Excelente aluno!");
		} else if(nota >= 75) {
			System.out.println("Muito bom aluno");
		} else if (nota >= 60) {
			System.out.println("Bom aluno");
		} else {
			System.out.println("Infelizmente você não passou, estude mais!");
		}

	}

}
