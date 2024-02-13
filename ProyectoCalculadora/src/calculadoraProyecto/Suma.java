package calculadoraProyecto;

import java.util.Scanner;

public class Suma extends Operacion{
	Scanner leer = new Scanner(System.in);

	public Suma(double num1, double num2) {
		super(num1, num2);
	}



	@Override
	public double ejecutar() {
		System.out.println("Suma:");
		 System.out.print("Ingrese el primer número: ");
         num1 = leer.nextDouble();
         leer.nextLine(); 

         System.out.print("Ingrese el segundo número:");
         num2 = leer.nextDouble();
         leer.nextLine();
        
     
		return num1 + num2;
	}

}
