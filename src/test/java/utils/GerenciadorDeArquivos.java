package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class GerenciadorDeArquivos {

//Metodo para ler arquivo do txt e retornar o conteudo

	public String lerArquivoTxt(String arquivo) {
		// StringBuiler é usado para constrir o conteudo do arquivo linha a linha
		StringBuilder conteudo = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader("./src/test/resources/arquivos/" + arquivo))) {
			String linha;
			while ((linha = reader.readLine()) != null) {
				conteudo.append(linha).append("\n");

			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}

		return conteudo.toString();

	}

	public String lerArquivoJson(String arquivo) {

		StringBuilder conteudo = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader("./src/test/resources/arquivos/" + arquivo))) {

			String linha;

			while ((linha = reader.readLine()) != null) {
				conteudo.append(linha).append("\n");

			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}

		return conteudo.toString();

	}

	public String lerArquivoXml(String arquivo) {
		StringBuilder conteudo = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader("./src/test/resources/arquivos/" + arquivo))) {

			String linha;
			while ((linha = reader.readLine()) != null) {
				conteudo.append(linha).append("\n");

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conteudo.toString();

	}

	/**
	 * 
	 * 
	 * @author joao
	 * @return
	 */
	public String lerArquivoPdf(String arquivoPDF) {
		StringBuilder conteudo = new StringBuilder();
		try (PDDocument documento = PDDocument.load(new File("./src/test/resources/arquivos/" + arquivoPDF))) {

			PDFTextStripper stripper = new PDFTextStripper();
			conteudo.append(stripper.getText(documento));

		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Erro ao tentar ler pdf");
		}

		return conteudo.toString();

	}

}
