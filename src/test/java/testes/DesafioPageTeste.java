package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.DesafioPage;
import runner.Executa;

public class DesafioPageTeste {
	DesafioPage page = new DesafioPage();


	@BeforeEach
	public void iniciarTeste() {
		Executa.iniciarTeste();
	}
	@AfterEach
	public void depoisTeste() {
		
		Executa.finalizarTeste();
		
		
		
		
	}
	@Test
	public void validarEstado() {
		page.selecionarEstado("Bahia");
	}
	
		
	@Test
	public void test5Segundos() {
		page.validarAlertDe5Segundos();
	}

}