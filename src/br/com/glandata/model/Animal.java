package br.com.glandata.model;

import java.util.Objects;

public class Animal {

	public Animal() {
	}

	public Animal(String nome, String tipo, String meioLocomocao) {
		this.nome = nome;
		this.tipo = tipo;
		this.meioLocomocao = meioLocomocao;
	}

	public Animal(String nome, String tipo, String meioLocomocao, String tipoAlimentacao, Integer idadeMaxima) {
		this.nome = nome;
		this.tipo = tipo;
		this.meioLocomocao = meioLocomocao;
		this.tipoAlimentacao = tipoAlimentacao;
		this.idadeMaxima = idadeMaxima;
	}

	private String tipo;
	private String tipoAlimentacao;
	private String meioLocomocao;
	private Integer idadeMaxima;
	private String nome;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public String getMeioLocomocao() {
		return meioLocomocao;
	}

	public void setMeioLocomocao(String meioLocomocao) {
		this.meioLocomocao = meioLocomocao;
	}

	public Integer getIdadeMaxima() {
		return idadeMaxima;
	}

	public void setIdadeMaxima(Integer idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", tipo=" + tipo + ", tipoAlimentacao=" + tipoAlimentacao + ", idadeMaxima="
				+ idadeMaxima + ", meioLocomocao=" + meioLocomocao + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idadeMaxima, meioLocomocao, nome, tipo, tipoAlimentacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(idadeMaxima, other.idadeMaxima) && Objects.equals(meioLocomocao, other.meioLocomocao)
				&& Objects.equals(nome, other.nome) && Objects.equals(tipo, other.tipo)
				&& Objects.equals(tipoAlimentacao, other.tipoAlimentacao);
	}

}
