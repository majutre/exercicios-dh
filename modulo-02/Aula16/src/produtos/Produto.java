package produtos;

public class Produto {

	private String nome;
	private double preco;
	int quantidade;
	protected int idProduto;
	
	//CONSTRUCTORS
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto() {
		
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;

	}
	
	//GET e SET (btD > Source > Generate Getters and Setters -ou- alt+shift+S)
	
	public double totalValorEstoque() {
		return preco * quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//
	public void adicionarProdutos(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preço=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	

}
