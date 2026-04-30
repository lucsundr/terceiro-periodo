package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado {
	public static void main(String[] args) throws IOException {
		System.out.println("Digite uma String: ");
		//InputStream é a classe que sabe capturar um byte
		//nesse caso recebendo-o da entrada padrão do sistema
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		//InputStreamReader sabe receber um byte e transformá-lo em char
		
		BufferedReader bufr = new BufferedReader(isr);
		//BufferedReader sabe receber vários char e armazená-los num
		//buffer, transformando-os em String
		
//		char c;
//		c = (char) isr.read();
		String s;
		s = bufr.readLine();
				
		System.out.println("Você digitou a frase: "+s);
		
	}

}
