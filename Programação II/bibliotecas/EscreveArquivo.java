package bibliotecas;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.OutputStream;

public class EscreveArquivo {
	public static void main(String[] args) throws IOException {
//		InputStream is = new FileInputStream("teste.txt");
		OutputStream os = new FileOutputStream("escrita.txt");
		OutputStreamWriter osr = new OutputStreamWriter(os);
	
		BufferedWriter bufw = new BufferedWriter(osr);
		
		bufw.write("Aprendendo Java no Senac");
		bufw.close();
		
		System.out.println("Escrita realizada com sucesso");
	}
}