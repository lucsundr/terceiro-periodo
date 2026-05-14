package aulaOO;

public class ControleSistemasInternos {
	int senha;
	
	void validaSenha(AcessoInterno acessoInterno) {
		acessoInterno.verificaSenha(senha);
	}

}
