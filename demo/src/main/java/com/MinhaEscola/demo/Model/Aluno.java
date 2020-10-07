package com.MinhaEscola.demo.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alunos")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_aluno;
	@Column
	private String nome;
	@Column
	private boolean matriculado;
	
	
	public Long getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(Long id_aluno) {
		this.id_aluno = id_aluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
		

}

