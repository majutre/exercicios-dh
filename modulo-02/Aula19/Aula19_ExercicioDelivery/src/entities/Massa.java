package entities;

import entities.enums.TipoMassa;

public class Massa extends Lanche {

	private String molho;
	private TipoMassa tipoMassa;
	
	public Massa() {
		super();
	}
	
	public Massa(Double preco, String molho, TipoMassa tipoMassa) {
		super(preco);
		this.molho = molho;
		this.tipoMassa = tipoMassa;
	}
	
	public Double tempoTotal(double distancia) {
		return 30 + super.tempo(distancia);
	}
}
