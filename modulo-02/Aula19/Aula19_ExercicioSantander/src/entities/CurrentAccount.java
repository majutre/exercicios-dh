package entities;

import java.util.Date;

public class CurrentAccount extends Account {

	private Double overdraftLimit;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(Double overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}
	
	public Double getLimitOverdraft() {
		return overdraftLimit;
	}

	public void setLimitOverdraft(Double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		double limit = getBalance() - amount;
		if (limit >= 0) {
			super.withdraw(amount);
		}
		if ((limit + overdraftLimit) >= 0) {
			super.withdraw(amount);
			overdraftLimit -= limit; 
		} else {
			System.out.println("Impossível sacar. O valor do saque superou o valor disponível.");
		}
	}
	
	public void depositCheck(Check check) {
		deposit(check.getValue());
	}

	@Override
	public String toString() {
		return "Conta-Corrente: [Limite de cheque especial: R$ " + String.format("%.2f", overdraftLimit) + "].";
	}
	
}
