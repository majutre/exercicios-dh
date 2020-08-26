package entities;

import java.util.ArrayList;
import java.util.List;

public class Sanduiche extends Lanche {

	private List<String> ingredientes = new ArrayList<>();

	public Sanduiche() {
		super();
	}


	public Sanduiche(Double preco, List<String> ingredientes) {
		super(preco);
		this.ingredientes = ingredientes;
	}

	public void adicionarIngredientes(List<Ingrediente> ingredientes, Ingrediente ing) {
		ingredientes.add(ing);
	}

	public void removerIngredientes(List<Ingrediente> ingredientes, Ingrediente ing) {
		ingredientes.remove(ing);
	}
	
	public Double tempoTotal(double distancia) {
		return 15 + super.tempo(distancia);
	}
}
