package geral;

public class Products {

	public String name;
	public double price;
	public int qt;
	public int qtAdd;
	public int qtRmv;
	public int total;
	public double vlr;
	
	public double valorEstoque() {
		double vlr = price * qt;
		return vlr;
	}
	
	public int adicionar() {
		total = qt + qtAdd;
		return total;
	}

	public int remover() {
		total = total - qtRmv;
		return total;
	}
}
