package exercicioDollar;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o valor do dólar?");
		double valorDolar = sc.nextDouble();
		
		System.out.println("Quantos dólares serão comprados?");
		double quantidade = sc.nextDouble();
		
		System.out.println("Quantidade a ser paga em reais: " + Dolar.conversor(valorDolar, quantidade));
	
		sc.close();
	}
}
