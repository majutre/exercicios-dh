package principal;

import java.util.Scanner;

import produtos.Produto;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Produto tv = new Produto ("TV", 900.00, 10);
		Produto ntb = new Produto ("Notebook", 2900.00);
		
		System.out.println(tv.getNome());
		tv.setNome("Televisão");
		System.out.println(tv.getNome());

		
		System.out.println(ntb.getPreco());
		double preco = scan.nextDouble();
		ntb.setPreco(preco);
		System.out.println(ntb.getPreco());
		
		scan.close();
	}

}
