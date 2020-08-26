package entities;

public class SavingsAccount extends Account {

	private Double interest;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Double balance, Double interest) {
		super(balance);
		this.interest = interest;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	@Override
	public void withdraw(double amount) {
		double limit = getBalance() - amount;
		if (limit >= 0) {
			super.withdraw(amount);
		} else {
			System.out.println("Imposs�vel sacar. O valor do saque superou o saldo dispon�vel.");
		}
	}

	public void claimInterest() {
		super.deposit(getBalance() * interest);
	}

	@Override
	public String toString() {
		return "Conta-poupan�a: [Saldo: R$ " 
			+ String.format("%.2f", super.getBalance())
			+ ", juros: "
			+ String.format("%.2f", interest) + "% ].";
	}

	
	
}
