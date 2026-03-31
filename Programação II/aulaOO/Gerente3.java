package aulaOO;

public class Gerente3 extends FuncionarioAbstrata3 implements AcessoInterno {
	private int senha;
	
	@Override
	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso NÃO autorizado");
			return false;
		}
		//entra no sistema de gerentes para verificação dos dados dos clientes e contas
		//inclusive com permissões de verificação, exclusão e alterações de dados críticos
	}
	
	@Override
	public double getBonus() {
		return this.salario * 0.17;
	}

}