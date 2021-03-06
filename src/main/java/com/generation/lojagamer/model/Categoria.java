package com.generation.lojagamer.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.generation.lojagamer.model.Produto;


	@Entity
	@Table(name= "tb_categoria")

	public class Categoria {
		
			@Id
			@GeneratedValue (strategy = GenerationType.IDENTITY)
			private Long Id;
			
			@NotNull (message = "Obrigatório!")
			@Size (min = 5 )
			private String tipo;
			
			@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
			@JsonIgnoreProperties("categoria")
			private List<Produto> produto;

			public Long getId() {
				return Id;
			}

			public void setId(Long id) {
				Id = id;
			}

			public String getTipo() {
				return tipo;
			}

			public void setTipo(String tipo) {
				this.tipo = tipo;
			}

			public List<Produto> getProduto() {
				return produto;
			}

			public void setProduto(List<Produto> produto) {
				this.produto = produto;
			}
	}


