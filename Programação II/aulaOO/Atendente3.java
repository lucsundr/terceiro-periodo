package aulaOO;

//OBS: não existe o Atende2
public class Atendente3 extends FuncionarioAbstrata3{
	int senha;
	
	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso NÃO autorizado");
			return false;
		}
		// entra no sistema de atendentes somente para consulta dos dados do cliente
	}
	
	
	public void atenderCliente() {
		//TODO
	}
	@Override
	public double getBonus() {
		return this.salario * 0.10;
	}
}