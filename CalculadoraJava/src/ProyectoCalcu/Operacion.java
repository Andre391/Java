package ProyectoCalcu;

import java.util.Scanner;

public class Operacion extends Calculadora implements IOperacion{
	Scanner leer = new Scanner(System.in);
	
	 private double num1;
	 private double num2;
	 public double result=0;
	 private int opcion;
	 

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getAns() {
		return ans;
	}

	public void setAns(double ans) {
		this.ans = ans;
	}

	
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
	public double cotangente(double anguloEnGrados) {
		double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        double cotangente = Math.cos(anguloEnRadianes) / Math.sin(anguloEnRadianes);
		return cotangente;
	}
	
	@Override
	public double secante(double anguloEnGrados) {
		double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        double secante = 1.0 / Math.cos(anguloEnRadianes);

        return secante;
	}

	@Override
	public double cosecante(double anguloEnGrados) {
		double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        double cosecante = 1.0 / Math.sin(anguloEnRadianes);

        return cosecante;
	}
	
	@Override
	public double radianes(double anguloEnGrados) {
		
		return Math.toRadians(anguloEnGrados);
	}

	@Override
	public void menu() {
		 
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
            		+"|10| Tangente\n"
            		+"|11|Cotangente\n"
            		+ "|12|Secante\n"
            		+ "|13|Cosecante \n"
            		+ "|14| Radianes \n");
            System.out.println("|0| Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            
		
	}

	@Override
	public void realizarOperacion() {
	    if (ans != 0) {
	        System.out.println("¿Desea usar el número anterior (" + ans + ") como primer número? (S/N)");
	        String respuesta = leer.next();
	        if (respuesta.equalsIgnoreCase("S")) {
	            num1 = ans; 
	        } else {
	            System.out.println("Ingrese el primer número:");
	            num1 = leer.nextDouble();
	        }
	    } else {
	        System.out.println("Ingrese el primer número:");
	        num1 = leer.nextDouble(); 
	    }




	    switch (opcion) {
	        case 1:
	    	    System.out.println("Ingrese el segundo número:");
	    	    num2 = leer.nextDouble();
	            ans = sumar(num1, num2);
	            break;
	        case 2:
	    	    System.out.println("Ingrese el segundo número:");
	    	    num2 = leer.nextDouble();
	            ans = restar(num1, num2);
	            break;
	        case 3:
	    	    System.out.println("Ingrese el segundo número:");
	    	    num2 = leer.nextDouble();
	            ans = multiplicar(num1, num2);
	            break;
	        case 4:
	    	    System.out.println("Ingrese el segundo número:");
	    	    num2 = leer.nextDouble();
	            ans = dividir(num1, num2);
	            break;
	        case 5:
	    	    System.out.println("Ingrese el segundo número:");
	    	    num2 = leer.nextDouble();
	            ans = porcentaje(num1, num2);
	            break;
	        case 6:
	            ans = raizCuadrada(num1);
	            break;
	        case 7:
	    	    System.out.println("Ingrese el número elevador:");
	    	    num2 = leer.nextDouble();
	            ans = elevar(num1, num2);
	            break;
	        case 8:
	            ans = seno(num1);
	            break;
	        case 9:
	            ans = coseno(num1);
	            break;
	        case 10:
	            ans = tangente(num1);
	            break;
	        case 11:
	            ans = cotangente(num1);
	            break;
	        case 12:
	            ans = secante(num1);
	            break;
	        case 13:
	            ans = cosecante(num1);
	            break;
	        case 14:
	            ans = radianes(num1);
	            break;
	        case 0:
	            System.out.println("Saliendo de la calculadora...");
	            return; 
	        default:
	            System.out.println("Opción no válida.");
	            return; 
	    }

	    System.out.println("El resultado es: " + ans);
	}



	@Override
	public double resultado() {
	
		return  ans;
	}





	
	
	
	
}
