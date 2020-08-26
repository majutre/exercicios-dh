package exercicio06;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, soma = 0;
		double x;
		
		System.out.print("Insira um número de termos: ");
		n = sc.nextInt();
		
		System.out.print("Insira um valor para x: ");
		x = sc.nextDouble();
		
		for (int i = 2; i < n; i++) {
			
			double y = Math.pow(x, i);
			
			
		}
		
		sc.close();
	}
}
