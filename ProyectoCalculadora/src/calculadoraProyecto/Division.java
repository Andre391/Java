package calculadoraProyecto;

import java.util.Scanner;

public class Division extends Operacion {
	Scanner leer = new Scanner(System.in);
	public Division(double num1, double num2) {
		super(num1, num2);
		 
	}

	@Override
	public double ejecutar() {
		 System.out.println("Ingrese el número a dividir:");
         num1 = leer.nextDouble();
         leer.nextLine(); 

         System.out.println("Ingrese el divisor :");
         num2 = leer.nextDouble();
         leer.nextLine();
		
		if(num2 != 0) {
			return num1/num2;
		}else {
			System.out.println("Error : División por cero");
			return Double.NaN;
		}
	}

}