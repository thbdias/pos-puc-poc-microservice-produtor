package br.com.produtor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.produtor.dto.ProdutorDTO;
import br.com.produtor.service.ProdutorService;


@RestController
@RequestMapping
public class ProdutorController {
	
	@Autowired
	private ProdutorService produtorService;
	
	@PostMapping("/save")
	public ProdutorDTO cadastrar(@RequestBody ProdutorDTO produtorDTO) {
		return produtorService.save(produtorDTO);
	}

}
