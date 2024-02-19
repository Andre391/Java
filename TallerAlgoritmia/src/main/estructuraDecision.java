package main;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EstructuraDecision {
	public static void main(String[]args) {
		Scanner leer = new Scanner(System.in);
        int opcion;

        do {
        	System.out.println("EJERCICIOS  DE CONTROL DE DECISIÓN:  ");
            System.out.println("1. Ejercicio 24");
            System.out.println("2. Ejercicio 26");
            System.out.println("3. Ejercicio 28");
            System.out.println("4. Ejercicio 30");
            System.out.println("5. Ejercicio 32");
            System.out.println("6. Ejercicio 34");
            System.out.println("7. Ejercicio 36");
            System.out.println("8. Ejercicio 38");
            System.out.println("9. Ejercicio 40");
            System.out.println("10. Ejercicio 42");
            System.out.println("11. Ejercicio 44");
            System.out.println("0. Salir");

            System.out.print("Seleccione el ejercicio que desea ejecutar (0 para salir): ");
            opcion = leer.nextInt();

            
            switch (opcion) {
                case 1:
                    ejecutarEjercicio24();
                    break;
                case 2:
                    ejecutarEjercicio26();
                    break;
                case 3:
                    ejecutarEjercicio28();
                    break;
                case 4:
                    ejecutarEjercicio30();
                    break;
                case 5:
                    ejecutarEjercicio32();
                    break;
                case 6:
                    ejecutarEjercicio34();
                    break;
                case 7:
                    ejecutarEjercicio36();
                    break;
                case 8:
                    ejecutarEjercicio38();
                    break;
                case 9:
                    ejecutarEjercicio40();
                    break;
                case 10:
                    ejecutarEjercicio42();
                    break;
                case 11:
                    ejecutarEjercicio44();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);

	}
	
	public static void ejecutarEjercicio24(){
		Scanner leer = new Scanner(System.in);
		double intereses = 0.0;
		
		System.out.println("");
		System.out.println("Ejercicio 24");
		
		System.out.print("Cuánto desea el cliente invertir? : ");
		double inversion = leer.nextDouble();
		System.out.print("Cuánto tiempo seria su inversión?(en años): ");
		double tiempo = leer.nextInt();
		
		double tasa=0.05; //Tasa de interes del 5%
		
		intereses = inversion * tasa * tiempo;
		
		System.out.println("Sus intereses son de: "+ intereses);
		
		double saldo =inversion + intereses;
		
		if(intereses>7000) {
			System.out.print("Desea reinvertir? s/n: ");
			char decision = leer.next().charAt(0);
			
			 if(decision == 's'){
				 System.out.println("Usted decidio reinveritir");
				 System.out.println("El total de su inversión con intereses es de: "+saldo);
				 double total = saldo + intereses;
				 System.out.println("Con su reinversión usted obtiene un total de: "+ total);
				 }else {
					 System.out.println("No decidio reinvertir");
					 System.out.println("El total de su inversión con intereses es de: "+saldo);
				 }
					 
		}else {			
			
			System.out.println("El total de su inversión con intereses es de: "+saldo);
			System.out.println("No es posible reinvertir debido a sus intereses menores a 7000");
			
		}
		System.out.println("");
	}
	
	
	public static void ejecutarEjercicio26(){
		Scanner leer = new Scanner(System.in);
		System.out.println("");
		int result=0;
		System.out.println("Ejercicio 26");
		
		System.out.print("Digite un entero para a: ");
		int a = leer.nextInt();
		System.out.print("Digite un entero para b: ");
		int b = leer.nextInt();
		System.out.print("Digite un entero para c: ");
		int c = leer.nextInt();
		System.out.print("Digite un entero para d: ");
		int d = leer.nextInt();
		
		if(d == 0) {
			result = (int) Math.pow((a-c), 2);
			System.out.println("El resultado cuando d es igual a 0 es de: "+ result);
		}else {
			result = (int) ((Math.pow((a-b), 3))/d);
			System.out.println("El resultado cuando d es mayor a 0 es de: "+ result);
		}
		System.out.println("");
	}
	
	
	public static void ejecutarEjercicio28(){
		
		Scanner leer = new Scanner(System.in);
		System.out.println("");
	System.out.println("Ejercicio 28");
	
	System.out.print("Cuál es el monto total de la compra?: ");
	double totalCompra = leer.nextDouble();
	double total= 0.0;
	double intereses;
	
	if (totalCompra>500000) {
		System.out.println("*Tiene la capacidad de invertir de su dinero el 55%");
		double propio = totalCompra * 0.55;
		System.out.println("Lo cual seria un valor de: "+propio);
		System.out.println("*Capacidad de pedir prestado al banco el 30%");
		double prestamo= totalCompra * 0.30;
		System.out.println("*Lo cual seria un valor de: "+prestamo);
		System.out.println("*El resto lo pagará solicitando un crédito al fabricante.");
		double credito= totalCompra * 0.15;
		intereses = credito * 0.20;
		double totalCredito = credito + intereses;
		System.out.println("Lo cual será con el 20% de intereses: "+ totalCredito);
		total= propio + totalCredito;
		System.out.println("En total de su Pago será: "+ total);
		
	}else {
		System.out.println("Tiene la capacidad de invertir de su dinero el 70%");
		double propio = totalCompra * 0.70;
		System.out.println("Lo cual seria un valor de: "+ propio);

		System.out.println("El resto lo pagará solicitando un crédito al fabricante.");
		double credito= totalCompra * 0.30;
		intereses = credito * 0.20;
		double totalCredito = credito + intereses;
		System.out.println("Lo cual será con el 20% de intereses: "+ totalCredito);
		total= propio + totalCredito;
		System.out.println("En total de su Pago será: "+ total);
	}
	
	System.out.println("");
}
	
	public static void ejecutarEjercicio30(){
		Scanner leer = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ejercicio 30");
        int A, B, C, D;

        System.out.print("Ingrese el dígito A: ");
        A = leer.nextInt();
        System.out.print("Ingrese el dígito B: ");
        B = leer.nextInt();
        System.out.print("Ingrese el dígito C: ");
        C = leer.nextInt();
        System.out.print("Ingrese el dígito D: ");
        D = leer.nextInt();

        int N = A * 1000 + B * 100 + C * 10 + D;
        System.out.println("El número unido es: "+ N);
     
        if (C >= 5) {
            B += 1;
            C = 0;
            D = 0;
        } else if(B>=5){
        	A +=1;
            C = 0;
            B = 0;
            D=0;
        }else {
        	C=0;
        	D = 0;
        }

        int resultRedon = A * 1000 + B * 100 + C * 10 + D;
        System.out.println("El resultado redodeado es: " + resultRedon);
			
        System.out.println("");
	}
	
	public static void ejecutarEjercicio32(){
		Scanner leer = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ejercicio 32");
		int P = 9, Q=5;
		//System.out.print("Ingrese el dígito P: ");
        //P = leer.nextInt();
        //System.out.print("Ingrese el dígito Q: ");
        //Q = leer.nextInt();
				System.out.println("--FORMULA--");
				System.out.println("P^3 + Q^4 - 2 * P^2");
			
			double formula = Math.pow(P, 3)+ Math.pow(Q,4)-2 * Math.pow(P, 2);
			
			if(formula > 680) {
				System.out.println("Los números de P y Q y que da un resultado mayor de 680 son: "+ P +" y "+ Q);
				System.out.println("Con la formula cumplen ese parametro");
			}else {
				System.out.println("Los números no cumplen que con la formula sea mayor a 680");
				System.out.println("Por lo tanto no se nombran aquellos números");
			}
		System.out.println("");
		
	}	
	public static void ejecutarEjercicio34(){
			Scanner leer = new Scanner(System.in);
			System.out.println("");
		System.out.println("Ejercicio 34");
		
		System.out.println("Categoria |1| ");
		System.out.println("Categoria |2| ");
		System.out.println("Categoria |3| ");
		System.out.println("Categoria |4| ");

		System.out.print("Digite el número de su categoria?: ");
		int categoria = leer.nextInt();
		System.out.print("Cuál es su sueldo?: ");	
		double sueldo = leer.nextDouble();
		double aumento = 0;
		double sueldoFinal= 0;
		
		switch (categoria) {
		case 1: 
			System.out.println("Categoria 1: Aumento del 15%");
			aumento= sueldo * 0.15;
			sueldoFinal = sueldo + aumento;
			System.out.println("Su aumento es de: "+ aumento);
			System.out.println("Su sueldo Final es de: "+ sueldoFinal);
			break;
		case 2: 
			System.out.println("Categoria 2: Aumento del 10%");
			aumento = sueldo * 0.10;
			sueldoFinal = sueldo + aumento;
			System.out.println("Su aumento es de: "+ aumento);
			System.out.println("Su sueldo Final es de: "+ sueldoFinal);
			break;
		case 3: 
			System.out.println("Categoria 3: Aumento del 8%");
			aumento = sueldo * 0.08;
			sueldoFinal = sueldo + aumento;
			System.out.println("Su aumento es de: "+ aumento);
			System.out.println("Su sueldo Final es de: "+ sueldoFinal);
			break;
		case 4: 
			System.out.println("Categoria 4: Aumento del 7%");
			aumento = sueldo * 0.07;
			sueldoFinal = sueldo + aumento;
			System.out.println("Su aumento es de: "+ aumento);
			System.out.println("Su sueldo Final es de: "+ sueldoFinal);
			break;	

		default:
			System.out.println("No existe la categoria que usted Digito");
			break;
		}
		System.out.println("");
		
	}
	public static void ejecutarEjercicio36(){
		Scanner leer = new Scanner(System.in);
		System.out.println("");
		//Explicación sobre este ejercicio
		System.out.println("Ejercicio 36");
		System.out.print("Ingrese la cantidad de Bolívares: ");
        int cantidadBolivares = leer.nextInt();

        int[] denominaciones = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10};

        System.out.println("Desglose de Bolívares:");

        for (int i = 0; i < denominaciones.length; i++) {
            if (cantidadBolivares >= denominaciones[i]) {
                int cantidadBilletes = cantidadBolivares / denominaciones[i];
                cantidadBolivares %= denominaciones[i];
                System.out.println(denominaciones[i] + " Bolívares: " + cantidadBilletes + " billete(s)");
            }
        }
        System.out.println("");
	}
	
	public static void ejecutarEjercicio38(){
		Scanner leer = new Scanner(System.in);
		System.out.println("");

		System.out.println("Ejercicio 38");


		  LocalDate fechaNaci = null;

    while (fechaNaci == null) {
        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNac = leer.nextLine();

        if (fechaNac.isEmpty()) {
            System.out.println("Por favor, ingrese una fecha válida.");
            continue; // Vuelve al inicio del bucle
        }

        try {
            fechaNaci = LocalDate.parse(fechaNac); // Convertir la fecha 

            // Obtener la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Calcular la edad
            int edad = fechaActual.getYear() - fechaNaci.getYear();

            if (fechaNaci.getDayOfYear() > fechaActual.getDayOfYear()) { // Se ajusta la edad por días
                edad--;
            }

            System.out.println("Tu edad es: " + edad + " años.");

            int mes = fechaNaci.getMonthValue();
            int dia = fechaNaci.getDayOfMonth();

            if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                System.out.println("Tu signo zodiacal es Sagitario.");
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
                System.out.println("Tu signo zodiacal es Capricornio.");
            } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
                System.out.println("Tu signo zodiacal es Acuario.");
            } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 19)) {
                System.out.println("Tu signo zodiacal es Piscis.");
            } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
                System.out.println("Tu signo zodiacal es Aries.");
            } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
                System.out.println("Tu signo zodiacal es Tauro.");
            } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
                System.out.println("Tu signo zodiacal es Geminis.");
            } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
                System.out.println("Tu signo zodiacal es Cáncer.");
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
                System.out.println("Tu signo zodiacal es Leo.");
            } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 22)) {
                System.out.println("Tu signo zodiacal es Virgo.");
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                System.out.println("Tu signo zodiacal es Libra.");
            } else {
                System.out.println("Tu signo zodiacal es Escorpio.");
            }

        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha incorrecto. Por favor, utilice el formato YYYY-MM-DD.");
            return; // Salir del programa si hay un error en el formato de la fecha
        }
    }
	}
	
	public static void ejecutarEjercicio40(){
		Scanner leer = new Scanner(System.in);
		System.out.println("");

			System.out.println("Ejercicio 40");
			System.out.print("Ingrese la lectura ANTERIOR en Kwh: ");
			int anterior = leer.nextInt();
			System.out.print("Ingrese la lectura ACTUAL en Kwh: ");
			int actual = leer.nextInt();
			
			int diferencia;
			
			if(actual > anterior) {
				 diferencia = actual - anterior;
			}else {
				 diferencia = anterior - actual;
			}
			
			double costo;
			
			if(diferencia <= 100) {
				costo = 2622;
			}else if(diferencia <=300) {
				costo = 79.78;
			}else if (diferencia <=500) {
				costo = 89.52;
			}else {
				costo = 97.95;
			}
			
			double totalPagar = diferencia * costo;
			
			System.out.println("El monto a pagar por consumo de luz eléctrica es: " + totalPagar + " Bs.");
			
			System.out.println("");
	}
		public static void ejecutarEjercicio42() {
			Scanner leer = new Scanner(System.in);
			System.out.println();
			System.out.println("Ejercicio 42");
			
			 System.out.print("Ingrese la edad en meses: ");
		        int edad = leer.nextInt();

		        System.out.print("Ingrese el nivel de hemoglobina en g%: ");
		        double hemoglobina = leer.nextDouble();

		        System.out.print("Ingrese el sexo (M para masculino, F para femenino): ");
		        char sexo = leer.next().charAt(0);

		        boolean tieneAnemia = false;

		        if ((edad >= 0 && edad <= 1 && (hemoglobina < 13 || hemoglobina > 26))
		                || (edad > 1 && edad <= 6 && (hemoglobina < 10 || hemoglobina > 18))
		                || (edad > 6 && edad <= 12 && (hemoglobina < 11 || hemoglobina > 15))
		                || (edad > 12 && edad <= 60 && (hemoglobina < 11.5 || hemoglobina > 15))
		                || (edad > 60 && edad <= 120 && (hemoglobina < 12.6 || hemoglobina > 15.5))
		                || (edad > 120 && edad <= 180 && (hemoglobina < 13 || hemoglobina > 15.5))
		                || (sexo == 'F' && edad > 180 && (hemoglobina < 12 || hemoglobina > 16))
		                || (sexo == 'M' && edad > 180 && (hemoglobina < 14 || hemoglobina > 18))) {
		            tieneAnemia = true; // La persona tiene anemia
		        }

		        // Mostrar el resultado
		        if (tieneAnemia) {
		            System.out.println("La persona tiene anemia.");
		        } else {
		            System.out.println("La persona no tiene anemia.");
		        }
		}
	
	public static void ejecutarEjercicio44(){
		Scanner leer = new Scanner(System.in);
		System.out.println("");
		        System.out.println("");
		        System.out.println("Ejercicio 44");
		        
		        System.out.print("Ingrese el monto de la hipoteca: $");
		        double hipoteca = leer.nextDouble();
		        double inverTotal = 0;
		        double inverPersona = 0;
		        double inverSocio = 0;

		        if (hipoteca < 1000000) {
		            inverPersona = hipoteca * 0.5;
		            inverSocio = hipoteca * 0.5;
		            inverTotal = hipoteca;
		        } else {
		            inverPersona = hipoteca;
		            inverSocio = (hipoteca - 1000000) / 2; 
		            inverTotal = hipoteca + inverSocio + inverSocio; 
		        }

		        System.out.println("Inversión de la persona: $" + inverPersona);
		        System.out.println("Inversión del socio: $" + inverSocio);
		        System.out.println("Inversión total: $" + inverTotal);
			System.out.println("");	
	}
}

