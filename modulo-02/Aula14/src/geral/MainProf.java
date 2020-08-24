package geral;

import java.util.Scanner;

public class MainProf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();

		prod.nome = sc.nextLine();
		prod.preco = sc.nextDouble();
		prod.quantidade = sc.nextInt();

		System.out.println("Dados do Produto: " + prod.nome + " R$ " + prod.preco + " " + prod.quantidade + " Total: " + prod.totalValorEstoque());

		System.out.print("Digite a quantidade a ser adicionada:");
		int quantidade = sc.nextInt();
		prod.adicionarProdutos(quantidade);

		System.out.println("Dados do Produto: " + prod.nome + " R$ " + prod.preco + " " + prod.quantidade + " Total: " + prod.totalValorEstoque());

		System.out.print("Digite a quantidade a ser removida:");
		quantidade = sc.nextInt();
		prod.removerProdutos(quantidade);
		System.out.println("Dados do Produto: " + prod.nome + " R$ " + prod.preco + " " + prod.quantidade + " Total: " + prod.totalValorEstoque());

		sc.close();

	}

}
