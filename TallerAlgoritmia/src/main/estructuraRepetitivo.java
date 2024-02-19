package main;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EstructuraRepetitivo {
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
            System.out.println("10.Ejercicio 64");
            System.out.println("11.Ejercicio 66");
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
                case 4:
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
                    break;
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

        for (int F = 28; F <= 54; F++) {
        	 C = (5.0 / 9.0) * (F - 32);
             K = F + 273.15;
             R = F + 459.67;

            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f%n", F, C, K, R);
        }

        for (int F = 450; F <= 950; F += 50) {
             C = (5.0 / 9.0) * (F - 32);
             K = C + 273.15;
             R = F + 459.67;

            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f%n", F, C, K, R);
        }

        for (int F = -50; F <= 250; F += 10) {
             C = (5.0 / 9.0) * (F - 32);
             K = C + 273.15;
             R = F + 459.67;

            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f%n", F, C, K, R);
        }
		
		System.out.println("");
	}
	public static void ejecutarEjercicio50(){
		
		System.out.println("");
		System.out.println("Ejercicio 50");
		
		int limitInfe = 97;
		int limitSupe = 1003;
		
	     int suma = 0;
	        for (int i = limitInfe; i <= limitSupe; i++) {
	            if (i % 2 == 0) {  
	                suma += i;
	            }
	        }

	    System.out.println("La suma de los números pares entre " + limitInfe + " y " + limitSupe + " es: " + suma);
        System.out.println("");}
	
	public static void ejecutarEjercicio52(){
		System.out.println("");
		Scanner leer = new Scanner(System.in);
		
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
	
	public static void ejecutarEjercicio54(){
		System.out.println("");
		Scanner leer = new Scanner(System.in);

        int cuestionario = 64;
        int preguntas = 23;

        double promGeneral = 0;
        double promMaximo = 0;
        double promMinimo = Double.MAX_VALUE;
        int countInferior3 = 0;
        int countEntre45y5 = 0;

        for (int i = 0; i < cuestionario; i++) {
            double totalPuntos = 0;

            System.out.println("Cuestionario " + (i + 1));

            for (int j = 0; j < preguntas; j++) {
                System.out.print("Ingrese el valor para la pregunta " + (j + 1) + " (entre 1 y 5): ");
                int respuesta = leer.nextInt();
                totalPuntos += respuesta;
            }

            double promedio = totalPuntos / preguntas;
            promGeneral += promedio;
            promMaximo = Math.max(promMaximo, promedio);
            promMinimo = Math.min(promMinimo, promedio);

            if (promedio < 3) {
                countInferior3++;
            }

            if (promedio >= 4.5 && promedio <= 5) {
                countEntre45y5++;
            }
        }

        promGeneral /= cuestionario;

        double porcentInferior3 = (double) countInferior3 / cuestionario * 100;
        double porcentEntre45y5 = (double) countEntre45y5 / cuestionario * 100;

        System.out.println("Promedio general: " + promGeneral);
        System.out.println("Promedio más alto: " + promMaximo);
        System.out.println("Promedio más bajo: " + promMinimo);
        System.out.println("Porcentaje de cuestionarios con promedio < 3: " + porcentInferior3 + "%");
        System.out.println("Porcentaje de cuestionarios con promedio entre 4.5 y 5: " + porcentEntre45y5 + "%");
        System.out.println("");
	}
	public static void ejecutarEjercicio56(){
		System.out.println("");
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese el número a dividir: ");
		int num1 = leer.nextInt();
		System.out.print("Ingrese el número divisor: ");
		int num2 = leer.nextInt();
		
		 if (num2 == 0) {
	            System.out.println("No es posible dividir por cero.");
	        } else {
	            int cociente = 0;

	            while (num1 >= num2) {
	            	System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	                num1 -= num2;
	                cociente++;
	            }

	            System.out.println("Cociente: " + cociente);
	            System.out.println("");
	        }
	}
	public static void ejecutarEjercicio58(){
		System.out.println("");
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese el capital a depositar: ");
		double capital= leer.nextDouble();
		System.out.print("Ingrese la tasa de interés (porcentaje): ");
        double tasaI = leer.nextDouble() / 100.0;
		System.out.print("Ingrese la duración del déposito en semanas: ");
		int duracion = leer.nextInt();
		
		 double capitalAcumulado = capital;

	        for (int semana = 1; semana <= duracion; semana++) {
	            double interesDiario = (tasaI * capitalAcumulado) / 365.0;
	            capitalAcumulado += interesDiario;
	        }

	        System.out.println("El capital acumulado al final del período es: $" + capitalAcumulado);
	}
	public static void ejecutarEjercicio60(){
		System.out.println("");
		Scanner leer = new Scanner(System.in);

        System.out.print("Número de factura: ");
        int numFac = leer.nextInt();

        System.out.print("Nombre del cliente: ");
        String nomCli = leer.next();

        System.out.print("Monto de la factura: ");
        double monFac = leer.nextDouble();

        System.out.print("Fecha de compra (yyyy-MM-dd): ");
        String fecComStr = leer.next();
        LocalDate fecCom = LocalDate.parse(fecComStr, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.print("Fecha de pago (yyyy-MM-dd): ");
        String fecPagStr = leer.next();
        LocalDate fecPag = LocalDate.parse(fecPagStr, DateTimeFormatter.ISO_LOCAL_DATE);
        
        long diasDiferencia =Math.abs(fecCom.until(fecPag).getDays());
  
        double interesMora = 0;
        
        if (diasDiferencia >= 60) {
            interesMora = monFac * 0.08;
            
        } else if (diasDiferencia >= 31 && diasDiferencia <= 59) {
            interesMora = monFac * 0.06;
        }

        double descuentoProntoPago = 0;
        
        if (diasDiferencia < 15) {
            descuentoProntoPago = monFac * 0.02;
        }

        double montoTotal = monFac + interesMora - descuentoProntoPago;

        System.out.println("         ---------FACTURA--------          ");
        System.out.println("___________________________________________");
        System.out.println("Número de factura: " + numFac);
        System.out.println("Nombre del cliente: " + nomCli);
        System.out.println("Monto a cancelar: " + montoTotal);
        System.out.println("Monto a pagar por interés de mora: " + interesMora);
        System.out.println("Monto descontado por pronto pago: " + descuentoProntoPago);
        System.out.println("______________________________________________");
        System.out.println();
    }
	public static void ejecutarEjercicio62(){
		System.out.println("");
		Scanner leer = new Scanner(System.in);
		
		int totalEmp = 0;
        int empAgricolas = 0;
        int empMineraSur = 0;
        int trabAgricolas = 0;
        int trabIndustriales = 0;
        int[] empPorLoc = new int[4]; // 4 localizaciones posibles

        System.out.print("Ingrese el número de empresas: ");
        totalEmp = leer.nextInt();

        for (int i = 0; i < totalEmp; i++) {
            System.out.println("Datos de la empresa #" + (i + 1));
            System.out.print("Actividad (1=Agrícola, 2=Industrial, 3=Minera, 4=Pesquera, 5=Otra): ");
            int actividad = leer.nextInt();

            System.out.print("Localización (1=Norte, 2=Sur, 3=Este, 4=Oeste): ");
            int localizacion = leer.nextInt();

            System.out.print("Número de trabajadores: ");
            int numTrabajadores = leer.nextInt();

            if (actividad == 1) {
                empAgricolas++;
                trabAgricolas += numTrabajadores;
            } else if (actividad == 3 && localizacion == 2) { 
                empMineraSur++;
            } else if (actividad == 2) {
                trabIndustriales += numTrabajadores;
                empPorLoc[localizacion - 1]++; // -1 para ajustar al índice del arreglo
            }
        }

        double porcentAgricolas = (empAgricolas * 100.0) / totalEmp;
        double porcentMineraSur = (empMineraSur * 100.0) / totalEmp;
        double promTrabajadoresAgricolas = (trabAgricolas * 1.0) / (empAgricolas != 0 ? empAgricolas : 1);
        double promTrabajadoresIndustriales = (trabIndustriales * 1.0) / (empPorLoc[1] != 0 ? empPorLoc[1] : 1);

        int locMaxEmpIndustriales = 0;
        int maxEmpresas = 0;

        for (int i = 0; i < empPorLoc.length; i++) {
            if (empPorLoc[i] > maxEmpresas) {
                maxEmpresas = empPorLoc[i];
                locMaxEmpIndustriales = i + 1; // +1 para ajustar al número de localización
            }
        }

        System.out.println("Porcentaje de empresas agrícolas: " + porcentAgricolas + "%");
        System.out.println("Porcentaje de empresas mineras del sur: " + porcentMineraSur + "%");
        System.out.println("Promedio de trabajadores en empresas agrícolas: " + promTrabajadoresAgricolas);
        System.out.println("Promedio de trabajadores en empresas industriales: " + promTrabajadoresIndustriales);
        System.out.println("Localización con mayor número de empresas industriales: " + locMaxEmpIndustriales);

		}
	public static void ejecutarEjercicio64(){
		System.out.println("");
		Scanner leer = new Scanner(System.in);
		double suma = 0.0;
        int terminos = 0;

        while (suma < 1.99) {
            terminos++;
            suma += 1.0 / Math.pow(2, terminos - 1);
        }

        System.out.println("Número de términos: " + terminos);
        System.out.println("Suma aproximada: " + suma);
	}
	public static void ejecutarEjercicio66(){
	System.out.println("");
	Scanner leer = new Scanner(System.in);
		int numVuelos;
		
     System.out.print("Ingrese el número de vuelos del día: ");
     numVuelos = leer.nextInt();

     for (int vuelo = 1; vuelo <= numVuelos; vuelo++) {
         int numPasajeros;
         System.out.print("Ingrese el número de pasajeros para el vuelo " + vuelo + ": ");
         numPasajeros = leer.nextInt();

         double montoTotalVuelo = 0;
         double porcentajePasajerosSinPagar = 0;
         double pesoMayor = 0, pesoMenor = Double.MAX_VALUE;
         String pasajeroMayorPeso = "", pasajeroMenorPeso = "";
         

         for (int pasajero = 1; pasajero <= numPasajeros; pasajero++) {
             String codigoAbordo, nombrePasajero;
             double totalKilos = 0, montoPagar = 0;

             System.out.print("Ingrese el código de abordo del pasajero " + pasajero + ": ");
             codigoAbordo = leer.next();

             System.out.print("Ingrese el nombre del pasajero " + pasajero + ": ");
             nombrePasajero = leer.next();

             int numMaletas;
             System.out.print("Ingrese el número de maletas que lleva el pasajero " + nombrePasajero + ": ");
             numMaletas = leer.nextInt();

             for (int maleta = 1; maleta <= numMaletas; maleta++) {
                 double pesoMaleta;
                 
                 System.out.print("Ingrese el peso de la maleta " + maleta + " en Kgs: ");
                 pesoMaleta = leer.nextDouble();

                 totalKilos += pesoMaleta;

                 if (pesoMaleta > pesoMayor) {
                     pesoMayor = pesoMaleta;
                     pasajeroMayorPeso = nombrePasajero;
                 }

                 if (pesoMaleta < pesoMenor) {
                     pesoMenor = pesoMaleta;
                     pasajeroMenorPeso = nombrePasajero;
                 }

                 if (pesoMaleta > 15) {
                     montoPagar += 2500;
                 } else if (pesoMaleta > 12) {
                     montoPagar += 2000;
                 } else if (pesoMaleta > 9) {
                     montoPagar += 1500;
                 } else if (pesoMaleta > 6) {
                     montoPagar += 1200;
                 } else if (pesoMaleta > 3) {
                     montoPagar += 600;
                 }
             }

             montoTotalVuelo += montoPagar;
             System.out.println("-------CONCLUSION VUELO-------");
             System.out.println("Vuelo: " + vuelo +"\n "
             		+ "Código de abordo: " + codigoAbordo +"\n"
             		+ "Nombre: " + nombrePasajero + "\n "
             		+ "Total de kilos: " + totalKilos + "\n"
             		+ "Monto a pagar: " + montoPagar);
         }
         System.out.println("---------------------");
         System.out.println("Para el vuelo " + vuelo + ":");
         System.out.println("Pasajero con mayor peso: " + pasajeroMayorPeso + " - Peso: " + pesoMayor + " Kgs");
         System.out.println("Pasajero con menor peso: " + pasajeroMenorPeso + " - Peso: " + pesoMenor + " Kgs");
         System.out.println("Monto total cancelado por equipaje: " + montoTotalVuelo);
         porcentajePasajerosSinPagar += (numPasajeros * 100);
         
         System.out.println("Porcentaje de pasajeros que no pagaron por equipaje: "+ porcentajePasajerosSinPagar +"%");
     }
  }
	
}
	

