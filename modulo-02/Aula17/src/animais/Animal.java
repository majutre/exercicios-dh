package animais;

public class Animal {

	private int patas;
	private String cor;
	private String especie;
	
	public Animal() {
		
	}
	
	public Animal(int patas, String cor, String especie) {
		this.patas = patas;
		this.cor = cor;
		this.especie = especie;
	}



	public int getPatas() {
		return patas;
	}



	public void setPatas(int patas) {
		this.patas = patas;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getEspecie() {
		return especie;
	}



	public void setEspecie(String especie) {
		this.especie = especie;
	}



	@Override
	public String toString() {
		return "Animal [patas=" + patas + ", cor=" + cor + ", especie=" + especie + "]";
	}

	
	
}
