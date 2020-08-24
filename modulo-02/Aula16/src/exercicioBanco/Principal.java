package exercicioBanco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		

		System.out.print("Insira o número da conta: ");
		int conta = input.nextInt();
		
		System.out.print("Insira o nome do titular: ");
		String titular = input.next();
	
		Conta conta1 = new Conta(conta, titular);
		
		System.out.print("Há depósito inicial? (s/n): ");
		input.nextLine();
		char resp = input.nextLine().toLowerCase().charAt(0);
				
		if (resp == 's') {
			System.out.print("Insira o valor a ser depositado: ");
			double deposito = input.nextDouble();
			conta1.depositar(deposito);
		}		

		System.out.println("Dados da conta:");
		System.out.println("Conta nº " + conta1.getNumConta() + ", Titular: " + conta1.getTitular() + ", Saldo: R$ " + conta1.getBalance());
		
		System.out.print("Insira o valor a ser depositado: ");
		double depositar = input.nextDouble();
		conta1.depositar(depositar);
		System.out.println("Conta nº " + conta1.getNumConta() + ", Titular: " + conta1.getTitular() + ", Saldo: R$ " + conta1.getBalance());
		
		System.out.print("Insira o valor a ser resgatado: ");
		double resgatar = input.nextDouble();
		conta1.resgatar(resgatar);
		System.out.println("Conta nº " + conta1.getNumConta() + ", Titular: " + conta1.getTitular() + ", Saldo: R$ " + conta1.getBalance());
		
		input.close();
	}


}
