package exercicio03;

import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		int num, i, j, fat;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantos numeros serão lidos: ");
		int n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Digite o " + i + "º número");
			num = sc.nextInt();
			fat = 1;
			
			for (j = 1; j <= num; j++) {
				fat *= j;
			}
			System.out.println("O Fatorial de " + num + " = " + fat);
		}
		
		sc.close();
	}
}
