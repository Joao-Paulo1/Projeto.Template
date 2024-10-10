package testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import metodos.Metodos;
import runner.Executa;

public class DesafioUiTeste {
	String url = "https://desafio.ui.e2etreinamentos.com.br/";
	Metodos metodo = new Metodos();

	@BeforeEach
	public void iniciarTest() {
		Executa.iniciarTeste();

	}

	@Test
	public void abrirSite() {

		metodo.validarUrl(url);

	}
}
