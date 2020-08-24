package exercicioDollar;

public class Dolar {
	
	public static final double IOF = 0.06; 

	
	public static double conversor(double valorDolar, double quantidade) {
		return (quantidade * valorDolar * IOF) + (quantidade * valorDolar); 
	}

}