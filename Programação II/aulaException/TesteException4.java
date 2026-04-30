package aulaException;

import java.io.FileNotFoundException;

public class TesteException4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		//Posso ter vários catches com Exceptions
		new java.io.FileReader("arquivoDeTeste.txt");
		//		} catch (FileNotFoundException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}  catch (IOException e) {
		//			// TODO: handle exception
		//		}
	}

}
