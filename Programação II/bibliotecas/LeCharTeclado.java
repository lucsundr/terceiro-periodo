package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {
	public static void main(String[] args) throws IOException {
		System.out.println("Digite uma tecla: ");
		//InputStream é a classe que sabe capturar um byte
		//nesse caso recebendo-o da entrada padrão do sistema
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		//InputStreamReader sabe receber um byte e transformá-lo em char
		
		char c;
		c = (char) isr.read();
		
		System.out.println("Você digitou a tecla: "+c);
		
	}

}
