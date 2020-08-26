package application;

import entities.Cliente;
import entities.Funcionario;
import entities.Pessoa;
import entities.enums.PlanoCliente;

public class Program {

	public static void main(String[] args) {
		
		Pessoa cliente1 = new Cliente(12, "Maju", PlanoCliente.ANUAL);
		Pessoa funcionario1 = new Funcionario(16, "Flavio", 1200.00, false);
		
		System.out.println(cliente1);
		System.out.println(funcionario1);
	}
}
