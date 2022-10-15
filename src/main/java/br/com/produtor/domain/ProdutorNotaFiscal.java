package br.com.produtor.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ProdutorNotaFiscal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private int numeroNota;
	
	private int pesoTotal;
	
	private Double valorNota;
	
	private String municipio;
	
	private LocalDate createAt;

}
