package entities;

public class Funcionario extends Pessoa {

	private Double salario;
	private Boolean estaDeFerias;

	public Funcionario() {
		super();
	}



	public Funcionario(Integer id, String nome, Double salario, Boolean estaDeFerias) {
		super(id, nome);
		this.salario = salario;
		this.estaDeFerias = estaDeFerias;
	}



	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Boolean getEstaDeFerias() {
		return estaDeFerias;
	}

	public void setEstaDeFerias(Boolean estaDeFerias) {
		this.estaDeFerias = estaDeFerias;
	}

	public String ferias() {
		if (estaDeFerias == true) {
			return "está de férias.";
		} else {
			return "não está de férias";
		}
	}
	@Override
	public String toString() {
		return "Funcionário:\n" 
				+ "ID: "
				+ super.getId()
				+ ", nome: "
				+ super.getNome()
				+ ", " 
				+ ferias();
	}
}
