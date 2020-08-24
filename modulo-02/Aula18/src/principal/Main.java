package principal;

import animais.Animal;
import animais.Mamifero;
import animais.Passaro;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal("Animal");
		Mamifero mamifero = new Mamifero("Mamífero");
		Passaro passaro = new Passaro("Passaro");
		
		animal.falar();
		mamifero.falar();
		passaro.falar();

	}

}
