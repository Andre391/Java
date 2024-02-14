package ProyectoCalcu;

import java.util.Scanner;

public class OperacionBasica extends Calculadora implements IOperacion{
	 private double num1;
	 private double num2;
	 private double result;
	
	@Override
	public double sumar(double num1, double num2) {
		return num1 + num2;
	}

	@Override
	public double restar(double num1, double num2) {
		return num1 - num2;
	}

	@Override
	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	@Override
	public double dividir(double num1, double num2) {
		
		if(num2 != 0) {
			return num1/num2;
		}else {
			System.out.println("Error : División por cero");
			return Double.NaN;
		}
	}

	@Override
	public double porcentaje(double num, double porcentaje) {
		return (num * porcentaje)/100;
	}

	@Override
	public double elevar(double base, double exponente) {
        return Math.pow(base, exponente);
	}

	@Override
	public double raizCuadrada(double num) {
      if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }
	}

	@Override
	public double seno(double anguloEnGrados) {
        return Math.sin(Math.toRadians(anguloEnGrados));
	}

	@Override
	public double coseno(double anguloEnGrados) {
		return Math.cos(Math.toRadians(anguloEnGrados));
	}

	@Override
	public double tangente(double anguloEnGrados) {
		return Math.tan(Math.toRadians(anguloEnGrados));
	}
	

	@Override
	public void menu() {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("\nBienvenido a la CALCULADORA\n"
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
            System.out.println("|0| Salir");
	        System.out.print("Seleccione una operación: ");
	        int opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1:
	                realizarOperacion("sumar");
	                break;
	            case 2:
	                realizarOperacion("restar");
	                break;
	            case 3:
	                realizarOperacion("multiplicar");
	                break;
	            case 4:
	                realizarOperacion("dividir");
	                break;
	            case 5:
	                realizarOperacion("porcentaje");
	                break;
	            case 6:
	                realizarOperacion("elevar");
	                break;
	            case 7:
	                realizarOperacion("raizCuadrada");
	                break;
	            case 8:
	                realizarOperacion("seno");
	                break;
	            case 9:
	                realizarOperacion("coseno");
	                break;
	            case 10:
	                realizarOperacion("tangente");
	                break;
	            case 0:
	                System.out.println("Saliendo de la calculadora.");
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Opción no válida. Por favor, seleccione una operación válida.");
	        }
		
	}

	@Override
	public void realizarOperacion() {
		menu();
	}
	
	private void realizarOperacion(String operacion) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        if (!operacion.equals("raizCuadrada") && !operacion.equals("seno") && !operacion.equals("coseno") && !operacion.equals("tangente")) {
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();
        }

        switch (operacion) {
            case "sumar":
                result = sumar(num1, num2);
                break;
            case "restar":
                result = restar(num1, num2);
                break;
            case "multiplicar":
                result = multiplicar(num1, num2);
                break;
            case "dividir":
                result = dividir(num1, num2);
                break;
            case "porcentaje":
                System.out.print("Ingrese el porcentaje: ");
                double porcentaje = scanner.nextDouble();
                result = porcentaje(num1, porcentaje);
                break;
            case "elevar":
                System.out.print("Ingrese el exponente: ");
                double exponente = scanner.nextDouble();
                result = elevar(num1, exponente);
                break;
            case "raizCuadrada":
                result = raizCuadrada(num1);
                break;
            case "seno":
                result = seno(num1);
                break;
            case "coseno":
                result = coseno(num1);
                break;
            case "tangente":
                result = tangente(num1);
                break;
            default:
                System.out.println("Operación no válida.");
        }
        System.out.println("Resultado: " + result);
    }

	@Override
	public double resultado() {
		return result;
	}

	
	
	
	
}
