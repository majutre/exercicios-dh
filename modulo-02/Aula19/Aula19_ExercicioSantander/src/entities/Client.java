package entities;

public class Client {
	
	private Integer id;
	private String sobrenome;
	private Integer rg;
	private String cpf;
	private Account account;
	
	public Client() {
	}

	public Client(Integer id, String sobrenome, Integer rg, String cpf, Account account) {
		this.id = id;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "DADOS DO CLIENTE:\n"
				+ "Número de cliente: " 
				+ id 
				+ ", sobrenome: " 
				+ sobrenome 
				+ ", RG nº " 
				+ rg 
				+ ", CPF nº " 
				+ cpf 
				+ ".\nDADOS DA CONTA:\n"
				+ account;
	}

}
