package animais;

public class Mamifero extends Animal{

	public Mamifero() {
		super();
	}

	public Mamifero(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		System.out.println("buga");
	}
	
}
