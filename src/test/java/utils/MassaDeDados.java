package utils;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

import com.github.javafaker.Faker;

public class MassaDeDados {
Faker faker = new Faker();


public String gerarNome() {
	
	return faker.name().name();
	
	
}
public String gerarSobreNome() {
	
	return faker.name().lastName();
	
	
}public String gerarEmail() {
	
	return faker.internet().emailAddress();
	
	
}public String gerarEndereco() {
	
	return faker.address().streetAddress();
	
	
}
public String gerardataNascimento() {
	
	Date dataNascimento = faker.date().birthday(18, 65);
	//converter  para localDate
	
	LocalDate localDate = dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	
	//Formatar a da no padrao"ddMMyyy"
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyy");
	return localDate.format(formatter);
	
	
	
	
	
}
public String gerarRg() {
	return faker.number().digits(10);
	
	
	
	
	
}
		String [] estadosBrasileiros = {"SP","RO","PR","MG"};
		
		
		public String gerarEstado() {
			Random random = new Random();
int index = random.nextInt(estadosBrasileiros.length);
return estadosBrasileiros[index];
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
