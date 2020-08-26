package exercicio02;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int fatorial = 1;

		System.out.print("Digite um número inteiro e positivo: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			fatorial *= i;
		}
		// Considerando: E = 1 + 1! + 1 + 2! + 1 + 3!  + ... + 1/N!
		
		double E = (1 + fatorial + N) / N;

		System.out.printf("O valor de E é igual a %.2f", E);
		
		sc.close();
	}

}
