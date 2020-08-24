package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * int num1; num1 = 2;
		 * 
		 * ou
		 */

		/*
		 * int num2 = 20;
		 * 
		 * String nome = "Maju";
		 */

		/*
		 * if(num2 >= 18) { // <, >, >=, <=, ==, != // &&, ||, !
		 * System.out.println("É maior de idade"); } else {
		 * System.out.println("É menor de idade"); }
		 */

		/*
		 * for (int i = 0; i<=10; i++) { int a = 8; a = 8 * i; System.out.println(a); }
		 * 
		 */

/*		int op;
		float num1 = 0, num2 = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Escolha uma opção: ");

			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Sair");

			op = sc.nextInt();
			
			if (op < 5) {

			System.out.println("Digite um número: ");
			num1 = sc.nextFloat();
			System.out.println("Digite um número: ");
			num2 = sc.nextFloat();
			}
			
			switch (op) {
			case 1:
				somar(num1, num2);
				break;

			case 2:

				subtrair(num1, num2);
				break;

			case 3:

				multiplicar(num1, num2);
				break;

			case 4:
				dividir(num1, num2);
				break;

			case 5:
				System.out.println("Obrigado! Volte logoooo");
				break;

			default:
				System.out.println("Opção inválida.");
			}

		} while (op != 5);
	}

	public static void somar(float num1, float num2) {

		Scanner sc = new Scanner(System.in);

		System.out.println("O resultado da operação é: " + (num1 + num2));
	}

	public static void subtrair(float num1, float num2) {

		System.out.println("O resultado da operação é: " + (num1 - num2));
	}
	
	public static void multiplicar(float num1, float num2) {

		Scanner sc = new Scanner(System.in);

		System.out.println("O resultado da operação é: " + (num1 * num2));
	}
	
	public static void dividir(float num1, float num2) {

		Scanner sc = new Scanner(System.in);

		System.out.println("O resultado da operação é: " + (num1 / num2));
	}
	
*/
		int[] notas = {5, 6, 8, 9, 10};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
}
