package exercicioAluno;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String passouDeAno() {
		if (notaFinal() >= 60) {
			return "PASS";
		} else {
			double x = 60 - notaFinal();
			return ("FAILED\n MISSING " + x + " POINTS");
		}
	}
}
