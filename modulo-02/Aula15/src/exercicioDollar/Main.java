package exercicioDollar;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � o valor do d�lar?");
		double valorDolar = sc.nextDouble();
		
		System.out.println("Quantos d�lares ser�o comprados?");
		double quantidade = sc.nextDouble();
		
		System.out.println("Quantidade a ser paga em reais: " + Dolar.conversor(valorDolar, quantidade));
	
		sc.close();
	}
}
