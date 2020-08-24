package exercicioBanco;

public class Conta {

	private int numConta;
	private String titular;
	private double balance;
	
	public Conta(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTitular() {
		return titular;
	}

	public double getBalance() {
		return balance;
	}

	
	public void depositar(double valor) {
		this.balance = balance + valor;
	}
	
	public void resgatar(double valor) {
		this.balance = balance - (valor + 5);
	}
	
	
}
