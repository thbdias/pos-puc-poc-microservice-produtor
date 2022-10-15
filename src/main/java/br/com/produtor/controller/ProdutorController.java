package br.com.produtor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.produtor.dto.NotaFiscalProdutorDTO;
import br.com.produtor.dto.ProdutorDTO;
import br.com.produtor.dto.UpdateSaldoPesoDTO;
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
	
	@PostMapping("/save/nota/fiscal/produtor")
	public NotaFiscalProdutorDTO cadastrarNotaFiscalProdutor(@RequestBody NotaFiscalProdutorDTO notaFiscalProdutorDTO) {
		return produtorService.save(notaFiscalProdutorDTO);
	}
	
	@PostMapping("/update/saldo/peso")
	public String upateSaldoPeso(@RequestBody UpdateSaldoPesoDTO updateSaldoPesoDTO) {
		produtorService.updateSaldoPeso(updateSaldoPesoDTO);
		return "atualizado";		
	}

}
