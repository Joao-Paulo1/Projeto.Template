package testes;

import utils.GerenciadorDeArquivos;

public class TesteArquivoTxt {
	 GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos();
	 
	
	public void mostrarArquivoTxt() {
		System.out.println(gerenciador.lerArquivoTxt("arquivo.text"));
		
		
		
	}

}
