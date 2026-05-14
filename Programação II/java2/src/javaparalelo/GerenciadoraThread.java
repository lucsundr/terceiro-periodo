package javaparalelo;

public class GerenciadoraThread {
	public static void main(String[] args) {
		DesenhaMapa dMapa = new DesenhaMapa();
		Thread tMapa = new Thread(dMapa);
		tMapa.start();
		
		BarraProgresso bProg = new BarraProgresso();
		Thread tProg = new Thread(bProg);
		tProg.start();
		
	}

}
