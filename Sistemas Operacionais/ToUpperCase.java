import java.io.*;

public class ToUpperCase {

    public static void main(String[] args) {

        String arquivo = "Alice.txt";

        try {

            FileReader fileReader = new FileReader(arquivo);
            BufferedReader in = new BufferedReader(fileReader);

            String linha;

            int numLinhas = 0;
            int numPalavras = 0;
            int numCaracteres = 0;

            while ((linha = in.readLine()) != null) {

                numLinhas++;

                numCaracteres += linha.length();

                String[] palavras = linha.split("\\s+");

                if (!linha.trim().isEmpty()) {
                    numPalavras += palavras.length;
                }
            }

            in.close();

            System.out.println("Linhas: " + numLinhas);
            System.out.println("Palavras: " + numPalavras);
            System.out.println("Caracteres: " + numCaracteres);

        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }
    }
}
