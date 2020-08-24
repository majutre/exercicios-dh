package animais;

public class Elefante extends Animal{
	
	private Integer presas = 2;
	
	public Elefante() {
		super();
	}
	
	public Elefante(int patas, String cor, String especie, Integer presas) {
		super(patas, cor, especie);
		this.presas = presas;
	}

	public Elefante(Integer presas) {

		this.presas = presas;
	}

	public Integer getPresas() {
		return presas;
	}

	public void setPresas(Integer presas) {
		this.presas = presas;
	}
	
	
}
