package exercicioRetangulo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();

		System.out.println("Insira a largura e altura do ret�ngulo: ");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		/*		
		System.out.println("�rea: " + ret.area());

		System.out.println("Per�metro: " + ret.perimetro());
		System.out.println("Diagonal: " + ret.diagonal());
*/
		System.out.println(ret);
		sc.close();
}
}

