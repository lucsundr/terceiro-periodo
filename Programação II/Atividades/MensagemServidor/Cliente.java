package javaZap;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        try {

            try (Socket cliente = new Socket("10.136.71.1", 12345)) {
				BufferedReader leitor = new BufferedReader(
				        new InputStreamReader(cliente.getInputStream()));

				PrintWriter escritor = new PrintWriter(
				        cliente.getOutputStream(), true);

				try (Scanner texto = new Scanner(System.in)) {
					Thread receber = new Thread(() -> {

					    try {

					        String mensagem;

					        while ((mensagem = leitor.readLine()) != null) {

					            System.out.println("\nServidor: " + mensagem);
					            System.out.print("Você: ");
					        }

					    } catch (Exception e) {

					        System.out.println("Conexão encerrada.");
					    }
					});

					receber.start();

					while (true) {

					    System.out.print("Você: ");

					    String msg = texto.nextLine();

					    escritor.println(msg);
					}
				}
			}

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }
}
