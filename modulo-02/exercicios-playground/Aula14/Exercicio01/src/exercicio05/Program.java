package exercicio05;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idAluno, idMaiorAluno = 0, idMenorAluno = 0;
		double Altura, MaiorAltura, MenorAltura;
		MaiorAltura = 0;
		MenorAltura = 99;
		
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o n�mero do aluno:");
            idAluno = sc.nextInt();

            System.out.println("Digite a altura do aluno:");
            Altura = sc.nextDouble();
            
            	if (Altura > MaiorAltura) {
            		MaiorAltura = Altura;
            		idMaiorAluno = idAluno;
            	}
            	if (Altura < MenorAltura) {
            		MenorAltura = Altura;
            		idMenorAluno = idAluno;
            	}
        }
        System.out.println("O aluno n� " + idMaiorAluno + ", com altura de " + String.format("%.2f", MaiorAltura) + "m, � o maior aluno.");
        System.out.println("O aluno n� " + idMenorAluno + ", com altura de " + String.format("%.2f", MenorAltura) + "m, � o menor aluno.");
	}
}
