package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.println("Digite os dados:");
		System.out.println("Nome:");
		funcionario.nome = sc.nextLine();
		System.out.println("Sal�rio:");
		funcionario.salario = sc.nextDouble();
		System.out.println("Taxa:");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println("Funcion�rio(a): " + funcionario.nome + ", R$" + funcionario.valorLiquido() + "." );
		
		System.out.println("Digite a porcentagem a ser aumentada no sal�rio:");
		double porcentagem = sc.nextDouble();
		funcionario.aumentaSalario(porcentagem);
		
		System.out.println("Dados atualizados: " + funcionario.nome + ", R$" + funcionario.valorLiquido() + "." );
		sc.close();

	}

}
