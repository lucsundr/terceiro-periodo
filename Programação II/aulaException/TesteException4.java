package aulaException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteException4 {
	public static void main (String[] args) {
		//Posso ter vários catches com Exceptions
		try {
		new java.io.FileReader("arquivoDeTeste.txt");
	} catch (FileNotFoundException e) {
		//TODO Auto-generated catch bloc
		e.printStackTrace();
	} catch (IOException e) {
		//TODO: handle exception
	}
}
	
}