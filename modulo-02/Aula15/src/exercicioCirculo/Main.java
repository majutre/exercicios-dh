package exercicioCirculo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println(Circulo.circunferencia(3));
		System.out.println(Circulo.volume(3));
		
		System.out.println(Circulo.circunferencia(4));
		System.out.println(Circulo.volume(4));
		sc.close();
	}

}
