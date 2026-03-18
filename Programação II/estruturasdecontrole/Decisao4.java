package estruturasdecontrole;

public class Decisao4 {
	public static void main(String[] args) {
		//	CUIDADO: O EXEMPLO NÃO FUNCIONA DIREITO DENTRO DA REGRA DE NEGÓCIO QUE GOSTARÍAMOS
		int nota = 82;

		switch (nota) {
		case 90:
			System.out.println("Excelente");
			break;
		case 75:
			System.out.println("Muito bom");
			break;
		case 60:
			System.out.println("Bom");
			break;

		default:
			System.out.println("Reprovado");
			break;
		}

		

	}

}
