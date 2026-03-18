package estruturasdecontrole;

public class InterrupcaoBreak1 {

	public static void main(String[] args) {
		String nomes[] = {"Thiago","Jarbas","Lucas","Zeneida","Ruimar","Felipe"};
		String nomePesquisa = "Jarbas";
		boolean nomeEncontrado = false;
		
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(nomePesquisa)) {
				nomeEncontrado = true;
				break;
			}
		}
		
		if (nomeEncontrado) {
			System.out.println("Parabéns, você encontrou o nome: "+nomePesquisa);
		} else {
			System.out.println("Infelizmente o nome "+nomePesquisa+" não foi encontrado!");

		}


	}

}
