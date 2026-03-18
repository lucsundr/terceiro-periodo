package estruturasdecontrole;

public class InterrupcaoContinue1 {
	public static void main(String[] args) {
		String nomes[] = {"Lucas","Jarbas","Lucas","Thiago","Lucas","Zeneida","Lucas"};
		int contador = 0;
		for (int i = 0; i < nomes.length; i++) {
			if (!nomes[i].equals("Lucas")) {
				continue; //interrompe o fluxo e continua para a próxima iteração do for
			}
			contador++;
		}
		
		System.out.println("Foram encontrados "+contador+" Lucas na lista");
		
	}

}
