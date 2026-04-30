package bibliotecas;

public class TestaMath {
	public static void main(String[] args) {
		int i = -10;
		System.out.println(i);
		int j = Math.abs(i);
		System.out.println(j);
		
		double d1 = 4.15;
		System.out.println(d1);
		// int k = Math.round(d1);
		double d2 = Math.round(d1);
		System.out.println(d2);
		
		//max
		int i1 = 12;
		int i2 = 10;
		System.out.println("O máximo entre i1 e i2 é: "+Math.max(i1, i2));
		
		//min
		System.out.println("O mínimo entre i1 e i2 é: "+Math.min(i1, i2));
		
		//ceil
		@SuppressWarnings("unused")
		double d3 = 4.3;
		double d4 = 4.2;
		System.out.println("O teto de d4 é: "+Math.ceil(d4));
		
		//floor
		System.out.println("O piso de d4 é: "+Math.floor(d4));
		
		//exp
		System.out.println("Constante de Euler (E) elevada a um número: "+Math.exp(1));
		System.out.println("Constante de Euler (E) built in do Java: "+Math.E);
		
		//log
		System.out.println("Log de 2 na base natural: "+Math.log(2));
		System.out.println("Log de 2 na base 10: "+Math.log10(2));
		
		//pow
		System.out.println(Math.pow(2, 3));
		
		//sqrt
		System.out.println("Raiz quadrada de um número (4): "+Math.sqrt(4));
		
		//sin
		System.out.println("Função seno (sin): seno de 90º em radianos: "+Math.sin(1.5708));
		
		//toDegrees
		System.out.println("Quanto é 1.5707963267948966 em graus? "+Math.toDegrees(1.5707963267948966));
		System.out.println("Função seno (sin): seno de 90º: "+Math.sin(Math.toRadians(90)));
		
		//toRadians
		System.out.println("Quanto é 90º em radianos: "+Math.toRadians(90));
	}

}
