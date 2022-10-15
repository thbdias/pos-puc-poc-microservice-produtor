package br.com.produtor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.produtor.domain.ProdutorNotaFiscal;

@Repository
public interface ProdutorNotaFiscalRepository extends CrudRepository<ProdutorNotaFiscal, Long>{

}
