package edu.fae.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fae.rest.model.Noticia;
import edu.fae.rest.repository.NoticiaRepository;

/**
 * 
 * @author robson
 *
 */
@RestController
@RequestMapping("/api/noticias")
public class NoticiaController {
	@Autowired NoticiaRepository noticiaRepository;

	/**
	 * @return Retorna todas as notícias
	 */
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Noticia> findAll() {
		return noticiaRepository.findAll();
	}
	
}
