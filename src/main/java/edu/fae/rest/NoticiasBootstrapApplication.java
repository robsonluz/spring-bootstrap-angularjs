package edu.fae.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoticiasBootstrapApplication {

//	//Dados iniciais da base de dados
//	@Bean
//	CommandLineRunner runner(NoticiaRepository noticiaRepository){
//		return args -> {
//			noticiaRepository.save(new Noticia("Notícia 1", "Texto da Notícia 1"));
//			noticiaRepository.save(new Noticia("Notícia 2", "Texto da Notícia 2"));
//			noticiaRepository.save(new Noticia("Notícia 3", "Texto da Notícia 3"));
//			noticiaRepository.save(new Noticia("Notícia 4", "Texto da Notícia 4"));
//		};
//	}	
	
	public static void main(String[] args) {
		SpringApplication.run(NoticiasBootstrapApplication.class, args);
	}
}
