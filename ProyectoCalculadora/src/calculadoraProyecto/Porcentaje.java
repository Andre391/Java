package calculadoraProyecto;

import java.util.Scanner;

public class Porcentaje extends Operacion {
	Scanner leer = new Scanner(System.in);
	public Porcentaje(double num1, double num2) {
		super(num1, num2);
		
	}

	@Override
	public double ejecutar() {
		 System.out.println("Ingrese el número:");
         num1 = leer.nextDouble();
         leer.nextLine(); 

         System.out.println("Ingrese el número de procentaje que desea:");
         num2 = leer.nextDouble();
         leer.nextLine();
		return (num1*num2)/100;
	}
	
}
