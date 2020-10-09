package com.LojaDeGames.MinhaLojaGames.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.LojaDeGames.MinhaLojaGames.CategoriaController;

@Entity
@Table(name = "produto")
public class ProdutoModel {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		private String nome;
		
		@NotNull
		private String marca;
		
		@NotNull
		private String descricao;
		
		@NotNull
		private Double preco;
		
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private CategoriaModel categoria;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getDescricao() {
			return descricao;
		}


		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}


		public Double getPreco() {
			return preco;
		}


		public void setPreco(Double preco) {
			this.preco = preco;
		}


		public CategoriaModel getCategoria() {
			return categoria;
		}


		public void setCategoria(CategoriaModel categoria) {
			this.categoria = categoria;
		}

		
		
}
