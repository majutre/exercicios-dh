package exercicioRetangulo;

public class Retangulo {

	double width;
	double height;

	public double area() {
		return width * height;
	}

	public double perimetro() {
		return (width * 2) + (height * 2);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	@Override
	public String toString() {
		return "Área: " + area() + ",\nPerímetro: " + perimetro() + ",\nDiagonal: " + diagonal() + ".";
	}
}
