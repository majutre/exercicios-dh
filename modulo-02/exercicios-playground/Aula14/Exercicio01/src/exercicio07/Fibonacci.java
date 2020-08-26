package exercicio07;

public class Fibonacci {
	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {
			System.out.print(fib(i) + "\n");
		}

	}

	static Integer fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
