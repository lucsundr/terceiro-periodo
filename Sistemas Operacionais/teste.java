import java.io.*;

public class SimpleShell {

    public static void main(String[] args) throws IOException {

        String commandLine;

        BufferedReader console =
                new BufferedReader(
                        new InputStreamReader(System.in));

        // Termina com CTRL+C
        while (true) {

            // Ler o comando do usuário
            System.out.print("jsh> ");
            commandLine = console.readLine();

            // Se o usuário apenas pressionar ENTER
            if (commandLine.equals(""))
                continue;

            try {

                // Divide o comando em partes
                String[] command = commandLine.split(" ");

                // Cria o processo
                ProcessBuilder pb = new ProcessBuilder(command);

                // Inicia o processo
                Process process = pb.start();

                // Obtém a saída do comando
                InputStream is = process.getInputStream();
                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(is));

                String line;

                // Exibe a saída
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                process.waitFor();

            } catch (Exception e) {
                System.out.println("Erro ao executar comando: "
                        + e.getMessage());
            }
        }
    }
}