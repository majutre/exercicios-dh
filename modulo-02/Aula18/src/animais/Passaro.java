package animais;

public class Passaro extends Animal{

	public Passaro() {
		super();
	}

	public Passaro(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		System.out.println("piu");
	}
	
}
