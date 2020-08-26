package entities;

public class Bolo extends Lanche {

	private String massa;
	private String recheio;
	private String cobertura;
	
	
	public Bolo() {
		super();
	}


	public Bolo(Double preco, String massa, String recheio, String cobertura) {
		super(preco);
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}
	
	public Double tempoTotal(double distancia) {
		return 10 + super.tempo(distancia);
	}
}
