package animais;

import java.util.Scanner;

public class Selva {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Elefante elefante = new Elefante(4, "cinza", "mam�fero", 2);
		
		Elefante ele2 = new Elefante();
		ele2.setPatas(3);

		sc.close();
		
	}
	
}
