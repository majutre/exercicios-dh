package exercicioAluno;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Insira o nome:");
		aluno.nome = sc.nextLine();
		
		System.out.println("Insira as notas:");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("NOTA FINAL = " + aluno.notaFinal());
		System.out.println(aluno.passouDeAno());
		
	}
}