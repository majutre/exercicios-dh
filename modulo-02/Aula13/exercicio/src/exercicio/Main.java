package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int day;
		
		System.out.println("Selecione o dia:");
		System.out.println("1 - Segunda-feira");
		System.out.println("2 - Terça-feira");
		System.out.println("3 - Quarta-feira");
		System.out.println("4 - Quinta-feira");
		System.out.println("5 - Sexta-feira");
		System.out.println("6 - Sábado");
		System.out.println("7 - Domingo");
		
		day = input.nextInt();
	
		if ((day < 6) && (day > 0)) {
			System.out.println("Que pena, ainda não é final de semana :(");
		} else if ((day < 8) && (day > 5)) {
			System.out.println("UHU! É final de semana!");
		} else {
			System.out.println("Insira um número válido.");
		}
	}

}