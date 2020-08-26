package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.Client;
import entities.CurrentAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		List<Client> clientes = new ArrayList<>();
		
		System.out.println("Insira os dados do cliente:\n");
		
		System.out.print("Número de cliente: ");
		int id = sc.nextInt();
		
		System.out.print("Sobrenome: ");
		sc.nextLine();
		String sobrenome = sc.nextLine();
		
		System.out.print("RG: ");
		int rg = sc.nextInt();
		
		System.out.print("CPF: ");
		sc.nextLine();
		String cpf = sc.nextLine();
		
		System.out.println("\nTipo de conta: ");
		System.out.println("[C] Corrente");
		System.out.println("[P] Poupança");

		char c = sc.next().toLowerCase().charAt(0);
		
		if (c == 'c') {
			
			System.out.print("\nLimite do cheque especial: ");
			double overdraftLimit = sc.nextDouble();
			
			clientes.add(new Client(id, sobrenome, rg, cpf, new CurrentAccount(overdraftLimit)));
			
		} else if (c == 'p') {
			
			System.out.print("\nValor do depósito inicial: ");
			double balance = sc.nextDouble();
			
			System.out.print("Juros: ");
			double interest = sc.nextDouble();
			
			clientes.add(new Client(id, sobrenome, rg, cpf, new SavingsAccount(balance, interest)));
		}
		System.out.println();
		for (Client cli : clientes) {
			System.out.println(cli);
		}
		sc.close();
	}
}
