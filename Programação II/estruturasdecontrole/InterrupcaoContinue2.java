package estruturasdecontrole;

public class InterrupcaoContinue2 {
	public static void main(String[] args) {
		foraDoLoopInterno: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Dentro do for do loop j");
				if(j == 2)
					continue foraDoLoopInterno;
			}
			System.out.println("Fora do for do loop j");
		}
		
	}

}
