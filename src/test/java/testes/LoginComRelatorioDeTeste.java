package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import elementos.ElementosSaucedemo;
import metodos.Metodos;
import runner.Executa;
import utils.Relatorio;

public class LoginComRelatorioDeTeste {
	@BeforeEach
	public void setup() {
		Relatorio.setupReport();
		Executa.iniciarTeste();
	}

	@AfterEach
	public void tearDown() {
		Relatorio.salvarRelatorio();
		
		
		
	}

	Metodos metodo = new Metodos();
	ElementosSaucedemo el = new ElementosSaucedemo();

	@Test
	public void testLogin() {
		try {
			Relatorio.startTest("Testes de login com sucesso");
			metodo.escrever(el.username, "standard_user");
			metodo.escrever(el.password, "secrete_sauce");
			metodo.clicar(el.btnLogin);
			Relatorio.logInf("Cliquei no botão de login");

		} catch (Exception e) {
			Relatorio.logFail("Falha no login" + e.getLocalizedMessage());
			throw e;

		}
	}
	@Test
		public void testCompra() {
			try {
				Relatorio.startTest("Testes de Compra com sucesso");
				metodo.escrever(el.username, "standard_user");
				metodo.escrever(el.password, "secrete_sauce");
				metodo.clicar(el.btnLogin);
				Relatorio.logInf("Cliquei no botão de login");

			} catch (Exception e) {
				Relatorio.logFail("Falha no login" + e.getLocalizedMessage());
				throw e;

			}

	}
}
