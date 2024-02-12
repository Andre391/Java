package main;


import java.util.Scanner;

public class estructuraRepetitivo {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int opcion;

        do {
        	System.out.println("EJERCICIOS  DE CONTROL DE DECISIÓN:  ");
            System.out.println("1. Ejercicio 46");
            System.out.println("2. Ejercicio 48");
            System.out.println("3. Ejercicio 50");
            System.out.println("4. Ejercicio 52");
            System.out.println("5. Ejercicio 54");
            System.out.println("6. Ejercicio 56");
            System.out.println("7. Ejercicio 58");
            System.out.println("8. Ejercicio 60");
            System.out.println("9. Ejercicio 62");
            System.out.println("10. Ejercicio 64");
            System.out.println("11. Ejercicio 68");
            System.out.println("0. Salir");

            System.out.print("Seleccione el ejercicio que desea ejecutar (0 para salir): ");
            opcion = leer.nextInt();

            
            switch (opcion) {
                case 1:
                    ejecutarEjercicio46();
                    break;
                case 2:
                    ejecutarEjercicio48();
                    break;
                case 3:
                    ejecutarEjercicio50();
                    break;
                /*case 4:
                    ejecutarEjercicio52();
                    break;
                case 5:
                    ejecutarEjercicio54();
                    break;
                case 6:
                    ejecutarEjercicio56();
                    break;
                case 7:
                    ejecutarEjercicio58();
                    break;
                case 8:
                    ejecutarEjercicio60();
                    break;
                case 9:
                    ejecutarEjercicio62();
                    break;
                case 10:
                    ejecutarEjercicio64();
                    break;
                case 11:
                    ejecutarEjercicio66();
                    break;*/
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);

	}
	
	public static void ejecutarEjercicio46(){
		Scanner leer = new Scanner(System.in);
		System.out.println("");
		double K=0.0;
		
		System.out.println("Ejericio 46");
		System.out.print("Digite el valor de N: ");
        int N = leer.nextInt();

        System.out.print("Digite el valor de K: ");
         K = leer.nextInt();

        if (K >= N) {
            System.out.println("Error: K debe ser menor que N.");
            return;
        }

        System.out.println("Valores desde N hasta K:");

        for (int i = N; i >= K; i--) {
            System.out.println("N-"+i);
        }
        System.out.println("");
	}
	public static void ejecutarEjercicio48(){
		Scanner leer = new Scanner(System.in);
		double K=0.0,C=0.0,R=0.0;
		System.out.println("");
        System.out.println("Ejercicio 48");
  System.out.printf("%-12s%-12s%-12s%-12s%n", "Fahrenheit", "Celsius", "Kelvin", "Rankine");

        // Generar la tabla de conversión
        for (int F = 28; F <= 54; F++) {
        	 C = (5.0 / 9.0) * (F - 32);
             K = F + 273.15;
             R = F + 459.67;

            // Imprimir una fila de la tabla
            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f%n", F, C, K, R);
        }

        for (int F = 450; F <= 950; F += 50) {
             C = (5.0 / 9.0) * (F - 32);
             K = C + 273.15;
             R = F + 459.67;

            // Imprimir una fila de la tabla
            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f%n", F, C, K, R);
        }

        for (int F = -50; F <= 250; F += 10) {
             C = (5.0 / 9.0) * (F - 32);
             K = C + 273.15;
             R = F + 459.67;

            // Imprimir una fila de la tabla
            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f%n", F, C, K, R);
        }
		
		System.out.println("");
	}
	public static void ejecutarEjercicio50(){
		Scanner leer = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ejercicio 50");
		
		int limitInfe = 97;
		int limitSupe = 1003;
		
	     int suma = 0;
	        for (int i = limitInfe; i <= limitSupe; i++) {
	            if (i % 2 == 0) {  // Verificar si el número es par
	                suma += i;
	            }
	        }

	        // Mostrar el resultado
	        System.out.println("La suma de los números pares entre " + limitInfe + " y " + limitSupe + " es: " + suma);
        System.out.println("");
        
        System.out.println("Ejercicio 52");
        double pesoNi = 0, pesoJo = 0, pesoAdul = 0, pesoVi = 0;
        int contNinos = 0, contJovenes = 0, contAdultos = 0, contViejos = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ": ");
            int edad = leer.nextInt();

            System.out.println("Ingrese el peso de la persona " + (i + 1) + ": ");
            double peso = leer.nextDouble();

            if (edad >= 0 && edad <= 12) {
                pesoNi += peso;
                contNinos++;
            } else if (edad >= 13 && edad <= 29) {
                pesoJo += peso;
                contJovenes++;
            } else if (edad >= 30 && edad <= 59) {
                pesoAdul += peso;
                contAdultos++;
            } else if (edad >= 60) {
                pesoVi += peso;
                contViejos++;
            }
        }

        double promNinos = (contNinos > 0) ? pesoNi / contNinos : 0;
        double promJovenes = (contJovenes > 0) ? pesoJo / contJovenes : 0;
        double promAdultos = (contAdultos > 0) ? pesoAdul / contAdultos : 0;
        double promViejos = (contViejos > 0) ? pesoVi / contViejos : 0;

        // Mostrar los resultados
        System.out.println("Promedio de peso de niños: " + promNinos);
        System.out.println("Promedio de peso de jóvenes: " + promJovenes);
        System.out.println("Promedio de peso de adultos: " + promAdultos);
        System.out.println("Promedio de peso de viejos: " + promViejos);
		
	}
}

