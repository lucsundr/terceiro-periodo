package colecoes;

import java.util.ArrayList;
import java.util.List;

import aulaOO.ContaCliente2;

public class TestaLista1 {
	public static void main(String[] args) {
		List lista1 = new ArrayList();
		lista1.add("Java");
		lista1.add("Python");
		lista1.add("Go");
		ContaCliente2 c20 = new ContaCliente2();
		ContaCliente2 c21 = new ContaCliente2();
		ContaCliente2 c22 = new ContaCliente2();
		c20.depositar(100);
		c21.depositar(200);
		c22.depositar(300);
		
		List contas = new ArrayList();
		
		contas.add(c20);
		contas.add(c21);
		contas.add(c22);
		
		System.out.println(contas.size());
		for (int i = 0; i < contas.size(); i++) {
			ContaCliente2 ccTemp = (ContaCliente2) contas.get(i);
			System.out.println(ccTemp.getSaldo());
		}
		
		
		
	}

}
