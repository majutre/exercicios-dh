package entities;

public abstract class Account {

	private Double balance;

	public Account() {

	}

	public Account(Double balance) {
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Account [saldo: " + getBalance() + "]";
	}
	
}
