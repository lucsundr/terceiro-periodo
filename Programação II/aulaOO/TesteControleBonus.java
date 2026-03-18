package aulaOO;

public class TesteControleBonus {

	public static void main(String[] args) {
		ControleBonus controle = new ControleBonus();
		
		Funcionario2 f2 = new Funcionario2();
		f2.setSalario(2000);
		controle.setTotalBonus(f2);
		System.out.println("Total de bônus pago até agora: "+controle.getTotalBonus());
		
		Gerente2 g2 = new Gerente2();
		f2.setSalario(2000);
		controle.setTotalBonus(g2);
		System.out.println("Total de bônus pago até agora: "+controle.getTotalBonus());

	}

}
