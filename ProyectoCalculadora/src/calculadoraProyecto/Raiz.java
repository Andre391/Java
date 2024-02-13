package calculadoraProyecto;

import java.util.Scanner;

public class Raiz extends Operacion{
	Scanner leer = new Scanner(System.in);
	public Raiz(double num1, double num2) {
		super(num1, num2);
	}
	@Override
	public double ejecutar() {
		System.out.println("Ingrese el número para sacarle Raiz");
		num1= leer.nextDouble();
		double result= Math.sqrt(num1);
		return result;
	}



}
