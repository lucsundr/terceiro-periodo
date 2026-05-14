package aulaOO;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Clayton";
		f1.salario = 10000.0;
		f1.status = "ativo";
		System.out.println("Salario atual: "+f1.salario);
//		f1.bonificacao(1200);
		System.out.println("Salario atual com vale Páscoa: "+f1.salario);
	}

}
