package io;

import java.util.Scanner;

public class TesteIOComScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String name = sc.next();
		System.out.println("Olá "+name+"!");
		sc.close();
	}

}
