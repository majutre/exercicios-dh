package geral;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	public double totalValorEstoque() {
		return preco * quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}

}
