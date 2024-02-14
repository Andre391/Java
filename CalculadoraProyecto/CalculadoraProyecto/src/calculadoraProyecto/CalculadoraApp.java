package calculadoraProyecto;

import java.util.Scanner;

public class CalculadoraApp extends CalculadoraBase{
	public static void main(String[] args) {
	      Scanner leer = new Scanner(System.in);
	        CalculadoraApp calculadora = new CalculadoraApp();
	       
	        while (true) {
	            System.out.println("\nOperaciones disponibles:\n"
	            		+"|1| Suma\n"
	            		+"|2| Resta\n"
	            		+"|3| Multiplicación\n"
	            		+"|4| División\n"
	            		+"|5| Porcentaje\n"
	            		+"|6| Elevar\n"
	            		+"|7| Raíz Cuadrada\n"
	            		+"|8| Seno\n"
	            		+"|9| Coseno\n"
	            		+"|10| Tangente");
	            System.out.println("|11| Salir");

	            System.out.print("Ingrese el número de la operación: ");
	            int opcion = leer.nextInt();

	            if (opcion == 11) {
	                System.out.println("Cerrando Calculadora");
	                break;
	            }

	            System.out.print("Ingrese el primer número: ");
	             double num1 = leer.nextDouble();

	            if (opcion != 7 || opcion != 8 || opcion != 9 || opcion != 10) { 
	                System.out.print("Ingrese el segundo número: ");
	                double num2 = leer.nextDouble();

	                if (opcion == 4 && num2 == 0) {
	                    System.out.println("Error: No se puede dividir por cero. Intente nuevamente.");
	                    continue;
	                }

	                System.out.println("Resultado: " + ejecutarOper(opcion, calculadora, num1, num2));
	            } else {
	                System.out.println("Resultado: " + ejecutarOper(opcion, calculadora, num1, 0));
	            }

	          
	        }
    }

	    private static double ejecutarOper(int opcion, CalculadoraApp calculadora, double num1, double num2) {
	        double result = 0;

	        switch (opcion) {
	            case 1:
	                result = calculadora.sumar(num1, num2);
	                break;
	            case 2:
	                result = calculadora.restar(num1, num2);
	                break;
	            case 3:
	                result = calculadora.multiplicar(num1, num2);
	                break;
	            case 4:
	                result = calculadora.dividir(num1, num2);
	                break;
	            case 5:
	                result = calculadora.porcentaje(num1, num2);
	                break;
	            case 6:
	                result = calculadora.elevar(num1, num2);
	                break;
	            case 7:
	                result = calculadora.raizCuadrada(num1);
	                break;
	            case 8:
	                result = calculadora.seno(num1);
	                break;
	            case 9:
	                result = calculadora.coseno(num1);
	                break;
	            case 10:
	                result = calculadora.tangente(num1);
	                break;
	            default:
	                System.out.println("Opción no válida. Intente nuevamente.");
	        }

	        System.out.println("Ans: " + calculadora.getAns()); 
	        return result;
	    }

}

