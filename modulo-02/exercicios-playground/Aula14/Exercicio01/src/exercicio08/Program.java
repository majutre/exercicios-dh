package exercicio08;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int n1 = 2;
		int n2 = 7;
		int n3 = 3;
		
		System.out.print("Insira um número: ");
		int n = sc.nextInt();
		
		System.out.print(n1 + ", " + n2 + ", " + n3 + ", ");
		for (int i = 4; i < n; i++) {
			
			n1 *= 2;
			n2 *= 3;
			n3 *= 4;
			
			System.out.print(n1 + ", " + n2 + ", " + n3 + ", ");
		}
		
		System.out.print("...");
		sc.close();
	}

}
