package exercicio01;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1995
		double salario = 1000.0;
		//1996
		double percentual = 1.5 / 100.0;
		double novoSalario = salario + percentual * salario;
		
		//1997+
		
		System.out.println("Digite o ano atual:");
		int ano = sc.nextInt();
		
		for (int i = 1997; i <= ano; i++) {		
			percentual *= 2;
			novoSalario += salario * percentual;
		}
		
		System.out.printf("O salário atual (ano de %d) é: R$ %.2f.", ano, novoSalario);
		sc.close();
	}
}
