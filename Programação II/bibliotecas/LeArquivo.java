package bibliotecas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("teste.txt");
//		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		//InputStreamReader sabe receber um byte e transformá-lo em char
		
		BufferedReader bufr = new BufferedReader(isr);
		//BufferedReader sabe receber vários char e armazená-los num
		//buffer, transformando-os em String
		
		String s;
		s = bufr.readLine(); //só lê uma linha
		System.out.println(s+"\n");
		
		while (s != null) {
			System.out.println(s);
			s = bufr.readLine();
		}
		
		
		
	}

}
