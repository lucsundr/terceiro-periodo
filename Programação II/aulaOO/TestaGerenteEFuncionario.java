package aulaOO;

public class TestaGerenteEFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(3000);
		double salFuncionario = f1.getSalario();
		System.out.println("Salário do funcionário: "+salFuncionario);
		System.out.println("Bônus do funcionário: "+f1.getBonus());
		
		Gerente g1 = new Gerente();
		g1.setSalario(17000);
		double salGerente = g1.getSalario();
		System.out.println("Salário do gerente: "+salGerente);
		System.out.println("Bônus do gerente: "+g1.getBonus());
	}

}
