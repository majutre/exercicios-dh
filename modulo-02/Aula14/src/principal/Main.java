package principal;

import java.util.Scanner;

import geometria.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//double xA, xB, xC, yA, yB, yC;
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Digite as medidas do triângulo X");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
				
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("O valor da área de X é: " + areaX);
		System.out.println("O valor da área de Y é: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("O maior triângulo é o X.");
		} else if (areaX < areaY) {
			System.out.println("O maior triângulo é o Y.");
		} else {
			System.out.println("Os triângulos são iguais.");
		}
		
		sc.close();
	}

}
