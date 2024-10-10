package pages;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;

public class LoginPage {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	private By nomePaginaLogado = By.xpath("//*[@id=\"root\"]/div/main/h1");
	private By msgError = By.xpath("//span[text()='Usuário ou senha incorretos']");
	/**
	 * Realizar o login da conta informando os dados de acesso
	 * @param username
	 * @param senha
	 */
	public void preencherDadosLogin(String username, String senha) {
		metodo.escrever(el.usuario, username);
		metodo.escrever(el.senha, senha);
		metodo.clicar(el.btnContinuar);
		metodo.validarUrl("http://52.2.114.98/login");
		metodo.aguardarElemento(nomePaginaLogado);
		metodo.validarTexto(nomePaginaLogado,"Saldo disponível:");
	}
	public void preencherDadosLoginNegativo(String username, String senha) {
		metodo.escrever(el.usuario, username);
		metodo.escrever(el.senha, senha);
		metodo.clicar(el.btnContinuar);
		metodo.aguardarElemento(msgError);
		metodo.validarTexto(msgError, "Usuário ou senha incorretos");
		
	
	}
}
