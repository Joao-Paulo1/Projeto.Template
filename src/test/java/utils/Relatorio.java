package utils;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Relatorio {
	private static com.aventstack.extentreports.ExtentReports extent;
	private static ExtentTest test;
	private static ExtentSparkReporter sparkReporter;// gerar relatorios no formato html

	public static void setupReport() {
		// inicializa o ExtentSparkReporter com o caminho para o arquivo HTML
		sparkReporter = new ExtentSparkReporter("./relatorios/relatorio.html");

		// configurar o titulo do relatorio
		sparkReporter.config().setDocumentTitle("Relátorio de Teste");

		// configurar o nome do relatorio
		sparkReporter.config().setReportName("Relatório de Execução de Testes");

		// configurar o tema do relatorio para Dark ou Standart

		sparkReporter.config().setTheme(Theme.DARK);
		// inicializa a instancia do do ExtendsReports

		extent = new com.aventstack.extentreports.ExtentReports();

		// anexa a configuração Spark ao ExtendsReports
		extent.attachReporter(sparkReporter);

		extent.setSystemInfo("Sistema Operacional", "Windowns");
		extent.setSystemInfo("Ambiente de Testes", "Selenium com Junit");
	}

	// Metodo iniciar um teste
	public static void startTest(String nomeDoTeste) {
		test = extent.createTest(nomeDoTeste);

	}

	// Metodos para finalizar e salvar relatórios
	public static void salvarRelatorio() {
		// salva o relatorio e encerra a execução
		extent.flush();

	}
//Metodo para registrar falhas no relatorio 
	public static void logFail(String mensagem) {
		
		test.fail(mensagem);
		
		
	}
	// Metodo para registrar informações
	public static void logInf(String mensagem) {
		test.info(mensagem);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}