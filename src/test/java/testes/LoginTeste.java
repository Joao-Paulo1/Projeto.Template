package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.HomePage;
import pages.LoginPage;
import runner.Executa;
import utils.MassaDeDados;

public class LoginTeste {
	
	HomePage home = new HomePage();
	LoginPage login = new LoginPage();
	MassaDeDados dados = new MassaDeDados();
	@BeforeEach
	public void antesDoTeste() {
		Executa.iniciarTeste();
		home.acessarMenu("Login");
	}
	
	@AfterEach
	public void depoisDoTeste() {
		Executa.finalizarTeste();
	}
	
	@Test
	public void loginEmBranco() {
		login.preencherDadosLoginNegativo("", "");
		
	}
	
	//@Test
	public void loginComSucesso() {
		login.preencherDadosLogin("526.129.275-78", "@fE2etreinamentos");
	}

}
