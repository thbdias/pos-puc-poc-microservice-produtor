package br.com.produtor.util;

import org.modelmapper.ModelMapper;


import br.com.produtor.domain.ProdutorNotaFiscal;
import br.com.produtor.dto.NotaFiscalProdutorDTO;


public class ProdutorNotaFiscalAdapter {
	
	private static ModelMapper mapper = new ModelMapper();
	
	public static ProdutorNotaFiscal adapt (NotaFiscalProdutorDTO notaFiscalProdutorDTO) {
		return mapper.map(notaFiscalProdutorDTO, ProdutorNotaFiscal.class);
	}

	public static NotaFiscalProdutorDTO adapt (ProdutorNotaFiscal produtorNotaFiscal) {
		return mapper.map(produtorNotaFiscal, NotaFiscalProdutorDTO.class);
	}
}
