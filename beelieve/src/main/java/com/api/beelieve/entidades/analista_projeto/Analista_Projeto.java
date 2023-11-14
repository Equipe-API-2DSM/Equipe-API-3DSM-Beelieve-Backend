package com.api.beelieve.entidades.analista_projeto;

import com.api.beelieve.entidades.projeto.Projeto;
import com.api.beelieve.entidades.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class Analista_Projeto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_relacao_analista_projeto;

	@ManyToOne
	private Projeto projeto;
	
	@ManyToOne
	private Usuario analista;
	
}
