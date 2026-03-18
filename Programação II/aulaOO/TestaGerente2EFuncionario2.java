package aulaOO;

public class TestaGerente2EFuncionario2 {
	public static void main(String[] args) {
		Funcionario2 f2 = new Funcionario2();
		f2.setSalario(3000);
		double salFuncionario = f2.getSalario();
		System.out.println("Salário do funcionário: "+salFuncionario);
		System.out.println("Bônus do funcionário: "+f2.getBonus());
		
		Gerente2 g2 = new Gerente2();
		g2.setSalario(20000);
		double salGerente = g2.getSalario();
		System.out.println("Salário do gerente2: "+salGerente);
		System.out.println("Bônus do gerente2: "+g2.getBonus());
	}

}
