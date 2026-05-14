package aulaException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteException3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Posso ter vários catches com Exceptions
		try {
			new java.io.FileReader("arquivoDeTeste.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (@SuppressWarnings("hiding") IOException e) {
			// TODO: handle exception
		}
	}

}
