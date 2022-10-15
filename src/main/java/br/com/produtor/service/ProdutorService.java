package br.com.produtor.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.produtor.domain.Produtor;
import br.com.produtor.domain.ProdutorNotaFiscal;
import br.com.produtor.dto.NotaFiscalProdutorDTO;
import br.com.produtor.dto.ProdutorDTO;
import br.com.produtor.dto.UpdateSaldoPesoDTO;
import br.com.produtor.repository.ProdutorNotaFiscalRepository;
import br.com.produtor.repository.ProdutorRepository;
import br.com.produtor.util.ProdutorAdapter;
import br.com.produtor.util.ProdutorNotaFiscalAdapter;

@Service
public class ProdutorService {
	
	@Autowired
	private ProdutorRepository produtorRepository;
	
	@Autowired
	private ProdutorNotaFiscalRepository produtorNotaFiscalRepository;

	
	public ProdutorDTO save(ProdutorDTO produtorDTO) {
		
		Produtor produtor = ProdutorAdapter.adapt(produtorDTO);
		produtor.setCreateAt(LocalDate.now());

		return ProdutorAdapter.adapt(produtorRepository.save(produtor));
	}
	
	
	
	public NotaFiscalProdutorDTO save(NotaFiscalProdutorDTO notaFiscalProdutorDTO) {
		
		ProdutorNotaFiscal produtorNotaFiscal = ProdutorNotaFiscalAdapter.adapt(notaFiscalProdutorDTO);
		produtorNotaFiscal.setCreateAt(LocalDate.now());
		
		return ProdutorNotaFiscalAdapter.adapt(produtorNotaFiscalRepository.save(produtorNotaFiscal));
	}



	public void updateSaldoPeso(UpdateSaldoPesoDTO updateSaldoPesoDTO) {
		ProdutorNotaFiscal nfe = produtorNotaFiscalRepository.findById(updateSaldoPesoDTO.getIdNotaFiscalProdutor()).get();
		
		nfe.setPesoTotal(nfe.getPesoTotal() - updateSaldoPesoDTO.getQuantidade());
		
		produtorNotaFiscalRepository.save(nfe);
	}

}
