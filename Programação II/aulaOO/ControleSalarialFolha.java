package aulaOO;

public class ControleSalarialFolha {
	private double totalSalarios = 0;
	
	public void setTotalSalarios(Funcionario2 funcionario2) {
		this.totalSalarios = this.totalSalarios + funcionario2.getSalario();
	}
	
	public double getTotalSalario() {
		return this.totalSalarios;
	}
	
}
