package com.mballem.curso.boot.util;

import java.util.List;

public class PaginacaoUtil<T> {

	private int tamanho;
	private int pagina;
	private long totalDePagina;
	private List<T> registros;
	
	public PaginacaoUtil(int tamanho, int pagina, long totalDePagina, List<T> registros) {
		this.tamanho = tamanho;
		this.pagina = pagina;
		this.totalDePagina = totalDePagina;
		this.registros = registros;
	}

	public int getTamanho() {
		return tamanho;
	}

	public int getPagina() {
		return pagina;
	}

	public long getTotalDePagina() {
		return totalDePagina;
	}

	public List<T> getRegistros() {
		return registros;
	}
	
}
