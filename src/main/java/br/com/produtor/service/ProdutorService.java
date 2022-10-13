package br.com.produtor.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.produtor.domain.Produtor;
import br.com.produtor.dto.ProdutorDTO;
import br.com.produtor.repository.ProdutorRepository;
import br.com.produtor.util.ProdutorAdapter;

@Service
public class ProdutorService {
	
	@Autowired
	private ProdutorRepository produtorRepository;

	public ProdutorDTO save(ProdutorDTO produtorDTO) {
		
		Produtor produtor = ProdutorAdapter.adapt(produtorDTO);
		produtor.setCreateAt(LocalDate.now());

		return ProdutorAdapter.adapt(produtorRepository.save(produtor));
	}

}
