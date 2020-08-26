package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Bolo;
import entities.Massa;
import entities.Sanduiche;
import entities.enums.TipoMassa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int op = 0;

		do {

			System.out.println("Escolha uma das op��es:");
			System.out.println("[1] Sandu�che");
			System.out.println("[2] Massa");
			System.out.println("[3] Bolo");
			System.out.println("[4] Sair");
			op = sc.nextInt();

			switch (op) {

			case 1:
				menuSanduiche();
				break;

			case 2:
				menuMassa();
				break;

			case 3:
				menuBolo();
				break;
			case 4:
				System.out.println("Obrigada e at� a pr�xima!");
				break;
			default:
				System.out.println("Op��o inv�lida.");
			}
		} while (op != 4);

		sc.close();
	}

	private static void menuSanduiche() {
		Scanner sc = new Scanner(System.in);

		List<String> ingredientes = new ArrayList<>();

		while (ingredientes.size() <= 10) {
			System.out.println("Digite um ingrediente:");
			ingredientes.add(sc.nextLine());
			System.out.println("Deseja adicionar outro ingrediente? (s/n)");
			char c = sc.next().toLowerCase().charAt(0);

			if (c == 'n') {
				break;
			}
		}

		Sanduiche sand = new Sanduiche(14.00, ingredientes);

		System.out.print("Digite a dist�ncia em km: ");
		double d = sc.nextDouble();
		

		System.out.println("Pre�o: " + sand.getPreco() + ", Tempo estimado (em minutos): " + sand.tempoTotal(d));
	
	}

	private static void menuMassa() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha o tipo de massa (Macarr�o, pizza ou lasanha): ");
		String tipo = sc.nextLine().toUpperCase();
		
		System.out.println("Escolha o molho: ");
		String molho = sc.nextLine();
		
		Massa massa = new Massa(20.00, molho, TipoMassa.valueOf(tipo));
		
		System.out.print("Digite a dist�ncia em km: ");
		double d = sc.nextDouble();

		System.out.println("Pre�o: " + massa.getPreco() + ", Tempo estimado (em minutos): " + massa.tempoTotal(d));
	

	}

	private static void menuBolo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha a massa: ");
		String massa = sc.nextLine();
		
		System.out.println("Escolha o recheio: ");
		String recheio = sc.nextLine();

		System.out.println("Escolha a cobertura: ");
		String cobertura = sc.nextLine();
		
		Bolo bolo = new Bolo(12.00, massa, recheio, cobertura);
		
		System.out.print("Digite a dist�ncia em km: ");
		double d = sc.nextDouble();

		System.out.println("Pre�o: " + bolo.getPreco() + ", Tempo estimado (em minutos): " + bolo.tempoTotal(d));
		
	}
}
