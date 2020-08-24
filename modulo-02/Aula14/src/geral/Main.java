package geral;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Products x = new Products();
		
		System.out.println("Insira os dados do produto:");
		
		System.out.println("Nome:");
		x.name = sc.nextLine();
		
		System.out.println("Preço:");
		x.price = sc.nextDouble();
		
		System.out.println("Quantidade:");
		x.qt = sc.nextInt();
		
		
		System.out.println("Dados do produto: " + x.name + ", "+ x.qt + " unidades, R$" + x.price + ". Valor total em estoque: " + x.valorEstoque() + ".");
		
		System.out.println("Insira número de produtos a serem adicionados ao estoque:");
		x.qtAdd = sc.nextInt();
		
		x.adicionar();
		
		System.out.println("Dados atualizados do produto: " + x.name + ", "+ x.total + " unidades, R$" + x.price + ".");
		
		System.out.println("Insira número de produtos a serem removidos do estoque:");
		x.qtRmv = sc.nextInt();
		
		x.remover();
		System.out.println("Dados atualizados do produto: " + x.name + ", "+ x.total + " unidades, R$" + x.price + ".");
		
		System.out.println(x);
		
		sc.close();
	}

}
