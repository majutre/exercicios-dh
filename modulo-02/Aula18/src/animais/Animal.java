package animais;

public class Animal {

	private String nome;
	
	public Animal() {
		
	}

	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void falar() {
		System.out.println("Animais n�o falam.");
	}

}
