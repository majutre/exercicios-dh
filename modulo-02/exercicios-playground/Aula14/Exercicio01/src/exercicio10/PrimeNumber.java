package exercicio10;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int n = sc.nextInt();
		
		System.out.println();
		for (int i = 2; i < n; i++) {
			
			if (n % i == 0) {
				System.out.println(n + " n�o � um n�mero primo.");
				break;
			}
			else {
				System.out.println(n + " � um n�mero primo.");
				break;
			}
		}
		
		
		sc.close();
	}
}
