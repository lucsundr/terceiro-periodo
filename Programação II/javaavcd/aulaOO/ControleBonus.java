package aulaOO;

public class ControleBonus {
	private double totalBonus = 0;
	
	public void setTotalBonus(Funcionario2 funcionario2) {
		this.totalBonus = this.totalBonus + funcionario2.getBonus();
	}
	
	public double getTotalBonus() {
		return this.totalBonus;
	}

}
