package javaZap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

    public static void main(String[] args) {

        try {

            ServerSocket servidor = new ServerSocket(10000);

            System.out.println("Servidor iniciado!");
            System.out.println("Aguardando conexão...");

            Socket usuario = servidor.accept();

            System.out.println("Cliente conectado!");

            BufferedReader leitor = new BufferedReader(
                    new InputStreamReader(usuario.getInputStream()));

            PrintWriter escritor = new PrintWriter(
            		usuario.getOutputStream(), true);

            Scanner teclado = new Scanner(System.in);

            Thread receber = new Thread(() -> {

                try {

                    String mensagem;

                    while ((mensagem = leitor.readLine()) != null) {

                        System.out.println("\nCliente: " + mensagem);
                        System.out.print("Você: ");
                    }

                } catch (Exception e) {

                    System.out.println("\nConexão encerrada.");
                }
            });

            receber.start();

            while (true) {

                System.out.print("Você: ");

                String msg = teclado.nextLine();

                escritor.println(msg);

                if (msg.equalsIgnoreCase("sair")) {

                    System.out.println("Servidor encerrado.");
                    break;
                }
            }

            teclado.close();
            usuario.close();
            servidor.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}