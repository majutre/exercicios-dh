package exercicio09;

public class Program {

	public static void main(String[] args) {

		int somarPar = 0;
		for (int i = 2; i < 101; i++) {
			if(i % 2 == 0) {
				somarPar += i;
			}
		}
		
		System.out.println("A soma dos 50 primeiros números pares é: " + somarPar);

	}

}
