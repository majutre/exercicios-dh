package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.PlanoCliente;

public class Cliente extends Pessoa {

	private PlanoCliente plano;

	List<String> aulas = new ArrayList<>();

	
	public Cliente() {
		super();
	}


	public Cliente(Integer id, String nome, PlanoCliente plano) {
		super(id, nome);
		this.plano = plano;
	}


	public PlanoCliente getPlano() {
		return plano;
	}


	public void setPlano(PlanoCliente plano) {
		this.plano = plano;
	}


	public List<String> getAulas() {
		return aulas;
	}


	public void setAulas(List<String> aulas) {
		this.aulas = aulas;
	}

	public void adicionarAula(String aula) {
		aulas.add(aula);
	}
	
	public void removerAula(String aula) {
		aulas.remove(aula);
	}


	@Override
	public String toString() {
		return "Cliente:\n" 
				+ "ID: "
				+ super.getId()
				+ ", nome: "
				+  super.getNome()
				+ ", Plano: " 
				+ plano;
	}
	
	
}
