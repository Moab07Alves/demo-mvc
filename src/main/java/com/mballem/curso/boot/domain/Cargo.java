package com.mballem.curso.boot.domain;

import java.util.List;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long>{

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
