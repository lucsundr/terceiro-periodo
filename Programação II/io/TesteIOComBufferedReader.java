package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TesteIOComBufferedReader {
	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		System.out.println("Digite seu nome:");
		try {
			name = dataIn.readLine();
		} catch (Exception e) {
			System.out.println("Erro");
		}
		System.out.println("Olá "+name+"!");
	}

}
