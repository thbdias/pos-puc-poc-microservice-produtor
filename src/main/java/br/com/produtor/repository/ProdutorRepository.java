package br.com.produtor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.produtor.domain.Produtor;

@Repository
public interface ProdutorRepository extends CrudRepository<Produtor, Long>{

}
