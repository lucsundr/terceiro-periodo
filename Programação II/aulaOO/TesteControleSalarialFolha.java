package aulaOO;

public class TesteControleSalarialFolha {

	public static void main(String[] args) {
		ControleSalarialFolha controle = new ControleSalarialFolha();
		
		Funcionario2 f2 = new Funcionario2();
		f2.setSalario(2000);
		controle.setTotalSalarios(f2);
		System.out.println("Total de salário até agora: "+controle.getTotalSalario());
		
		Gerente2 g2 = new Gerente2();
		g2.setSalario(1700);
		controle.setTotalSalarios(g2);
		System.out.println("Total de salários até agora: "+controle.getTotalSalario());
	}

}
