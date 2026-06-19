import java.io.*;
import java.util.*;

public class SimpleShell {
    public static void main(String[] args) throws IOException {

        String commandLine;

        BufferedReader console =
                new BufferedReader(
                        new InputStreamReader(System.in));

        while (true) {

            System.out.print("jsh> ");

            commandLine = console.readLine();

            if (commandLine.equals(""))
                continue;

            String[] tokens = commandLine.split(" ");

            List<String> command = new ArrayList<>();

            for (String token : tokens) {
                command.add(token);
            }

            try {

                ProcessBuilder pb =
                        new ProcessBuilder(command);

                Process process = pb.start();

                InputStream is = process.getInputStream();

                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(is));

                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                process.waitFor();

            } catch (IOException e) {

                // Comando inválido
                System.out.println(
                        "Comando inválido: " +
                                commandLine);
            } catch (InterruptedException e) {

                System.out.println(
                        "Erro na execução do processo.");
            }
        }
    }
}