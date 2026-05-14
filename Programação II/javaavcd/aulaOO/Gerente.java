package aulaOO;

public class Gerente extends Funcionario {
	private int senha;
	
	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso NÃO autorizado");
			return false;
		}
	}
	
	//sobrecarga ou overriding
	@Override
	public double getBonus() {
		return this.salario * 0.15;
	}
}