package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import produtos.Produto;

public class Main {

	public static void main(String[] args) {

		/*
		 * List<Integer> lista = new ArrayList();
		 * 
		 * lista.add(1); lista.add(2); lista.add(3); lista.add(4); lista.add(5);
		 * lista.add(6);
		 * 
		 * 
		 * for (int i = 0; i<lista.size(); i++) { System.out.println(lista.get(i)); }
		 */

		List<Produto> lista = new ArrayList();

		Produto p = new Produto("TV", 300.00, 10);
		lista.add(p);
		// OU
		lista.add(new Produto("Microondas", 100.00, 55));
		
		lista.stream().forEach(x -> System.out.println(x));

		Double soma = 0.0;
		/*
		 * for (int i = 0; i < lista.size(); i++) { soma = soma +
		 * lista.get(i).getPreco(); }
		 */

		for (Produto prod : lista) {
			soma = soma + prod.getPreco();
		}
		System.out.println("Soma: " + soma);

		List<Produto> r = lista.stream().filter(x -> x.getPreco() < 200).collect(Collectors.toList());
		
		r.stream().forEach(x -> System.out.println(x));

	}

}
