package br.com.produtor.util;

import org.modelmapper.ModelMapper;

import br.com.produtor.domain.Produtor;
import br.com.produtor.dto.ProdutorDTO;

public class ProdutorAdapter {
	
	private static ModelMapper mapper = new ModelMapper();
	
	public static Produtor adapt (ProdutorDTO produtorDTO) {
		return mapper.map(produtorDTO, Produtor.class);
	}

	public static ProdutorDTO adapt (Produtor produtor) {
		return mapper.map(produtor, ProdutorDTO.class);
	}
}
