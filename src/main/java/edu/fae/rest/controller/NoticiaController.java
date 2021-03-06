package edu.fae.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fae.rest.model.Message;
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
	
	/**
	 * @return Retorna uma noticia por id
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Noticia show(@PathVariable Long id) {
		return noticiaRepository.findOne(id);
	}
	
	/**
	 * Insere uma notícia na base de dados
	 */
	@RequestMapping(value="", method=RequestMethod.POST)
	public Noticia save(@RequestBody Noticia noticia) {
		noticiaRepository.save(noticia);
		return noticia;
	}		
	
	/**
	 * Remove uma notícia na base de dados
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public Message delete(@PathVariable Long id) {
		noticiaRepository.delete(id);
		return Message.OK;
	}	
	
}
