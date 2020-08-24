package principal;

public class Employee {
	public String nome;
	public double salario;
	public double taxa;
	
	public double valorLiquido() {
		return salario - taxa;
	}
	
	public void aumentaSalario(double porcentagem) {
		this.salario = salario + (salario * (porcentagem/100));
	}
}
