package animais;

public class Cachorro extends Animal{

	public Cachorro() {
		super();
	}

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		System.out.println("au");
	}
	
}
