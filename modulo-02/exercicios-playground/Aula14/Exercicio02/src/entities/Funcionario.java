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
			return "est� de f�rias.";
		} else {
			return "n�o est� de f�rias";
		}
	}
	@Override
	public String toString() {
		return "Funcion�rio:\n" 
				+ "ID: "
				+ super.getId()
				+ ", nome: "
				+ super.getNome()
				+ ", " 
				+ ferias();
	}
}
