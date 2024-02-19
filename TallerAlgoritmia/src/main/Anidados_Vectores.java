package main;

import java.util.Scanner;

public class Anidados_Vectores {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opcion;
	         
		 do {
	     	System.out.println("EJERCICIOS ANIDADOS Y VECTORES:  ");
	         System.out.println("1. Ejercicio 68");
	         System.out.println("2. Ejercicio 70");
	         System.out.println("3. Ejercicio 72");
	         System.out.println("4. Ejercicio 74");
	         System.out.println("5. Ejercicio 76");
	         System.out.println("6. Ejercicio 78");
	         System.out.println("7. Ejercicio 80");
	         System.out.println("-----VECTORES-----");
	         System.out.println("8. Ejercicio 82");
	         System.out.println("9. Ejercicio 84");
	         System.out.println("10.Ejercicio 86");
	         System.out.println("11.Ejercicio 88");
	         System.out.println("0. Salir");

	         System.out.print("Seleccione el ejercicio que desea ejecutar (0 para salir): ");
	         opcion = leer.nextInt();

	         
	         switch (opcion) {
	          case 1:
	                 ejecutarEjercicio68();
	                 break;
              case 2:
	                 ejecutarEjercicio70();
	                 break;
	          case 3:
	                 ejecutarEjercicio72();
	                 break;
	          case 4:
	                 ejecutarEjercicio74();
	                 break;
	          case 5:
	                 ejecutarEjercicio76();
	                 break;
	          case 6:
	                 ejecutarEjercicio78();
	                 break;
	          case 7:
	                 ejecutarEjercicio80();
	                 break;
	          case 8:
	                 ejecutarEjercicio82();
	                 break;
	          case 9:
	                 ejecutarEjercicio84();
	                 break;
	          case 10:
	                 ejecutarEjercicio86();
	                 break;
	          case 11:
	                 ejecutarEjercicio88();
	                 break;
	          case 0:
	                 System.out.println("Saliendo del programa.");
	                 break;
	          default:
	                 System.out.println("Opción no válida. Inténtelo de nuevo.");
	         }

	     } while (opcion != 0);
	}

	public static void ejecutarEjercicio68(){
		System.out.println("");
		int contador = 0;
        int numero = 1;

        while (contador < 3) {
            int sumaDivisores = 0;

            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }

            if (sumaDivisores == numero) {
                System.out.println("Número perfecto #" + (contador + 1) + ": " + numero);
                contador++;
            }

            numero++;
        }
	}
	public static void ejecutarEjercicio70(){
		Scanner leer = new Scanner(System.in);
	   System.out.println("");
	    int dias = 0;
	    int errores = 0;
	    double sumaMaximas = 0, sumaMinimas = 0;
	    double maxima, minima;
	
	    System.out.println("Ingrese las temperaturas diarias (máx, min). Para finalizar, ingrese 0, 0.");
	
	    do {
	        System.out.print("Día " + (dias + 1) + ": ");
	        maxima = leer.nextDouble();
	        minima = leer.nextDouble();
	
	        if (maxima == 0 && minima == 0) {
	            break; 
	        }
	
	        if (maxima >= 14 && maxima <= 30 && minima >= 14 && minima <= 30) {
	            sumaMaximas += maxima;
	            sumaMinimas += minima;
	            dias++;
	        } else {
	            System.out.println("Error: Temperatura fuera de rango. Ingrese nuevamente.");
	            errores++;
	        }
	        
	    } while (true);
	
	    if (dias > 0) {
	        double mediaMaxima = sumaMaximas / dias;
	        double mediaMinima = sumaMinimas / dias;
	
	        System.out.println("Número de días cuyas temperaturas se han proporcionado: " + dias);
	        System.out.println("Media máxima: " + mediaMaxima);
	        System.out.println("Media mínima: " + mediaMinima);
	        System.out.println("Número de errores ingresados: " + errores);
	
	        if (dias + errores > 0) {
	            double porcentajeErrores = (errores * 100.0) / (dias + errores);
	            System.out.println("Porcentaje de errores ingresados: " + porcentajeErrores + "%");
	        }
	    } else {
	        System.out.println("No se ingresaron temperaturas válidas.");
	    }
    }
	
	public static void ejecutarEjercicio72(){
	   Scanner leer = new Scanner(System.in);
	   System.out.println("");
	   
	   double M = 5.97e24; 
       double G = 6.67259e-11; 

       double maxF = Double.MIN_VALUE;
       double minF = Double.MAX_VALUE;
       double Ftotal = 0;

       double max_m = Double.MIN_VALUE;
       double mTotal = 0;

       double maxAltura = Double.MIN_VALUE;
       double minAltura = Double.MAX_VALUE;

       String satelMaxF = "";
       String satelMinF = "";

       System.out.println("Ingrese los datos de los satélites. Para finalizar, ingrese 'fin' en el nombre del satélite.");

       while (true) {
           System.out.print("Nombre del satélite: ");
           String nombreSatelite = leer.next();

           if (nombreSatelite.equals("fin")) {
               break;
           }

           System.out.print("País: ");
           String pais = leer.next();

           System.out.print("Masa (Kg): ");
           double masaSatelite = leer.nextDouble();

           System.out.print("Altura (Mts): ");
           double alturaSatelite = leer.nextDouble();


           double distancia = alturaSatelite + 6371000; 


           double fuerzaAtraccion = (G * masaSatelite * M) / (distancia * distancia);


           if (fuerzaAtraccion > maxF) {
               maxF = fuerzaAtraccion;
               satelMaxF = nombreSatelite;
           }

           if (fuerzaAtraccion < minF) {
        	   minF = fuerzaAtraccion;
               satelMinF = nombreSatelite;
           }

           Ftotal += fuerzaAtraccion;

           if (masaSatelite > max_m) {
               max_m = masaSatelite;
           }

           mTotal += masaSatelite;

           if (alturaSatelite > maxAltura) {
               maxAltura = alturaSatelite;
           }

           if (alturaSatelite < minAltura) {
               minAltura = alturaSatelite;
           }
       }

       if (Ftotal > 0) {
           double FPromedio = Ftotal / (maxF + minF);

           System.out.println("a) Mayor fuerza de atracción: " + maxF + " N (" + satelMaxF + ")");
           System.out.println("   Menor fuerza de atracción: " + minF + " N (" + satelMinF + ")");
           System.out.println("b) Fuerza de atracción promedio: " + FPromedio + " N");
           System.out.println("c) Mayor masa de los satélites: " + max_m + " Kg");
           System.out.println("d) Masa promedio de los satélites: " + (mTotal / max_m) + " Kg");
           System.out.println("e) Menor altura de los satélites: " + minAltura + " Mts");
           System.out.println("   Mayor altura de los satélites: " + maxAltura + " Mts");
       } else {
           System.out.println("No se ingresaron datos válidos de satélites.");
       }
   }
	public static void ejecutarEjercicio74(){
	   Scanner leer = new Scanner(System.in);
	   System.out.println("");
	   
	   int totalObreros;
        int limitProducSemanal;
        int obrerosQueCumplen = 0;
        int totalProducSemana = 0;
        int maxProduccion = Integer.MIN_VALUE;
        String obreroMaxProduccion = "";

        System.out.print("Ingrese el número total de obreros: ");
        totalObreros = leer.nextInt();

        System.out.print("Ingrese el límite de producción semanal por obrero: ");
        limitProducSemanal = leer.nextInt();


        for (int i = 1; i <= totalObreros; i++) {
            System.out.println("\nObrero " + i + ":");

            
            System.out.print("Nombre del obrero: ");
            String nomObrero = leer.next();

            int producTotal = 0;

            for (int dia = 1; dia <= 7; dia++) {
                System.out.print("Producción del día " + dia + ": ");
                int produccionDia = leer.nextInt();
                producTotal += produccionDia;
            }


            double porcentajeProduccion = (producTotal * 100.0) / (limitProducSemanal * 7);
            System.out.println("Producción total de la semana: " + producTotal);
            System.out.println("Porcentaje de producción semanal: " + porcentajeProduccion + "%");

            if (producTotal >= limitProducSemanal * 7) {
                obrerosQueCumplen++;
            }

            totalProducSemana += producTotal;

            if (producTotal > maxProduccion) {
                maxProduccion = producTotal;
                obreroMaxProduccion = nomObrero;
            }
        }

        double porcentajeCumplen = (obrerosQueCumplen * 100.0) / totalObreros;

        double promedioProduccion = totalProducSemana / (totalObreros * 7.0);


        System.out.println("\nResultados Generales:");
        System.out.println("Porcentaje de obreros que alcanzaron o superaron el límite: " + porcentajeCumplen + "%");
        System.out.println("Obrero que más produjo: " + obreroMaxProduccion + " - Cantidad producida: " + maxProduccion);
        System.out.println("Promedio de producción de la bloquera en la semana: " + promedioProduccion);
	}
public static void ejecutarEjercicio76(){
   Scanner leer = new Scanner(System.in);
   System.out.println("");

    System.out.print("Ingrese el número de grupos: ");
    int g = leer.nextInt();

    System.out.print("Ingrese el número de alumnos por grupo: ");
    int n = leer.nextInt();

    System.out.print("Ingrese el número de materias por alumno: ");
        int m = leer.nextInt();

  
        double promedioGeneral = 0;

        
        for (int grupo = 1; grupo <= g; grupo++) {
            System.out.println("\nGrupo " + grupo + ":");

        double promedioGrupo = 0;

        for (int alumno = 1; alumno <= n; alumno++) {
            System.out.println("\nAlumno " + alumno + ":");

            double promedioAlumno = 0;

            for (int materia = 1; materia <= m; materia++) {
                System.out.print("Ingrese el promedio de la materia " + materia + ": ");
                double calificacion = leer.nextDouble();
                promedioAlumno += calificacion;
            }

       
            promedioAlumno /= m;
            System.out.println("Promedio del alumno " + alumno + ": " + promedioAlumno);

            promedioGrupo += promedioAlumno;
        }

        promedioGrupo /= n;
        System.out.println("\nPromedio del grupo " + grupo + ": " + promedioGrupo);

        promedioGeneral += promedioGrupo;
    }

    promedioGeneral /= g;

    System.out.println("\nPromedio general de los grupos: " + promedioGeneral);
     
}


 public static void ejecutarEjercicio78(){
Scanner leer = new Scanner(System.in);
 System.out.println("");
  int sucurAlcanceEsperado = 0;
  double porcentSucursalAlcanceEsperado = 0;

 
  while (true) {
      System.out.print("Código de la sucursal (0 para finalizar): ");
      int codigoSucursal = leer.nextInt();

      if (codigoSucursal == 0) {
          break;
      }
      System.out.print("Monto Esperado de la Sucursal: ");
      double montoEsperadoSucursal = leer.nextDouble();
      double montoTotalVentasSucursal = 0;
      int codigoPuntoVentaMayorComision = 0;
      double montoMayorComision = 0;

      while (true) {
          System.out.print("Código del punto de venta (0 para finalizar): ");
          int codigoPuntoVenta = leer.nextInt();

          if (codigoPuntoVenta == 0) {
              break;
          }
          System.out.println("Digite Unidades Vendidad");
          int unidadesVendidas = leer.nextInt();

          double montoNetoVenta = unidadesVendidas * (10.0 + 15.0 + 20.0);

          double montoComision = montoNetoVenta * 0.1;


          montoTotalVentasSucursal += montoNetoVenta;

          if (montoComision > montoMayorComision) {
              codigoPuntoVentaMayorComision = codigoPuntoVenta;
              montoMayorComision = montoComision;
          }

          System.out.println("Punto de venta: " + codigoPuntoVenta);
          System.out.println("Unidades vendidas: " + unidadesVendidas);
          System.out.println("Monto neto de la venta: " + montoNetoVenta);
          System.out.println("Monto pagado por comisión a los vendedores: " + montoComision);
      }

      double porcentajeVentaEsperada = (montoTotalVentasSucursal * 100) / montoEsperadoSucursal;

      if (porcentajeVentaEsperada >= 100) {
          sucurAlcanceEsperado++;
      }


      System.out.println("\nResultados por sucursal " + codigoSucursal + ":");
      System.out.println("Monto total vendido: " + montoTotalVentasSucursal);
      System.out.println("Porcentaje de venta alcanzado en función de lo esperado: " + porcentajeVentaEsperada + "%");
      System.out.println("Código y monto del punto de venta que más pagó por comisión de venta: " + codigoPuntoVentaMayorComision + " - " + montoMayorComision);
  }

  porcentSucursalAlcanceEsperado = (sucurAlcanceEsperado * 100.0) / 3;

  System.out.println("\nResultados Generales:");
  System.out.println("Porcentaje de sucursales que alcanzaron el monto de venta esperado: " + porcentSucursalAlcanceEsperado + "%");
	
	}
 	public static void ejecutarEjercicio80(){
 		Scanner leer = new Scanner(System.in);
 		System.out.println("");
 		int totalMunicipios = 0;
        int ciudadMaxDesempleo = 0;
        double porcentajeMaxDesempleo = 0;

        System.out.print("Ingrese la cantidad total de municipios: ");
        totalMunicipios = leer.nextInt();

        for (int i = 1; i <= totalMunicipios; i++) {
            System.out.println("\nMunicipio " + i + ":");

            int totalDesempleadosMayores25 = 0;

            while (true) {
                System.out.print("Edad (0 para finalizar): ");
                int edad = leer.nextInt();

                if (edad == 0) {
                    break;
                }

                char nivelEducacion;
                do {
                    System.out.print("Nivel de educación (N: ninguna, B: básica, S: secundaria, P: profesional): ");
                    nivelEducacion = leer.next().charAt(0);
                } while (nivelEducacion != 'N' && nivelEducacion != 'B' && nivelEducacion != 'S' && nivelEducacion != 'P');

                char situacionActual;
                do {
                    System.out.print("Situación actual (D: desempleado, E: empleado): ");
                    situacionActual = leer.next().charAt(0);
                } while (situacionActual != 'D' && situacionActual != 'E');

                if (situacionActual == 'D' && nivelEducacion == 'N' && edad > 25) {
                    totalDesempleadosMayores25++;
                }
            }

            int totalPersonasEnMunicipio = totalDesempleadosMayores25;
            double porcentajeDesempleo = (totalPersonasEnMunicipio * 100.0) / totalPersonasEnMunicipio;

            System.out.println("Código del municipio: " + i);
            System.out.println("Cantidad de personas desempleadas, sin educación y mayores de 25 años: " + totalDesempleadosMayores25);

            if (porcentajeDesempleo > porcentajeMaxDesempleo) {
                ciudadMaxDesempleo = i;
                porcentajeMaxDesempleo = porcentajeDesempleo;
            }
        }

        System.out.println("\nResultados Generales:");
        System.out.println("Código de la ciudad con más del 50% de personas desempleadas, sin educación y mayores de 25 años: " + ciudadMaxDesempleo);
 	}
 	
 	
	public static void ejecutarEjercicio82(){
 		Scanner leer = new Scanner(System.in);
 		System.out.println("");
 		int cantidadAlumnos = 4;

        String[] nombres = {"María", "Juan Carlos", "Josefina", "José Luis"};
        int[][] notas = {
            {16, 14, 15, 13, 9},
            {10, 9, 7, 11, 14},
            {13, 12, 15, 17, 13},
            {7, 11, 10, 8, 17}
        };

        double[] promedios = new double[cantidadAlumnos];
        double promedioClase = 0;

        for (int i = 0; i < cantidadAlumnos; i++) {
            int sum = 0;
            for (int nota : notas[i]) {
                sum += nota;
            }
            promedios[i] = (double) sum / notas[i].length;
            promedioClase += promedios[i];
        }

        promedioClase /= cantidadAlumnos;

        System.out.println("Número Nombre Promedio");
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println((i + 1) + " " + nombres[i] + " " + promedios[i]);
        }

        System.out.println("\nPromedio de la clase: " + promedioClase);

        int cantidadMenorAlPromedio = 0;
        int cantidadMayorAlPromedio = 0;

        for (int i = 0; i < cantidadAlumnos; i++) {
            if (promedios[i] < promedioClase) {
                cantidadMenorAlPromedio++;
            } else if (promedios[i] > promedioClase) {
                cantidadMayorAlPromedio++;
            }
        }

        System.out.println("Alumnos con promedio menor al promedio de la clase: " + cantidadMenorAlPromedio);
        System.out.println("Alumnos con promedio mayor al promedio de la clase: " + cantidadMayorAlPromedio);
    
	}
	public static void ejecutarEjercicio84(){
 		Scanner leer = new Scanner(System.in);
 		System.out.println("");

         String[] proveedores = {"Proveedor1", "Proveedor2", "Proveedor3"};
         String[] ciudades = {"Ciudad1", "Ciudad2", "Ciudad3"};
         int[] numeroArticulos = {10, 15, 20};

        
         System.out.println("Proveedores Iniciales:");
         for (int i = 0; i < proveedores.length; i++) {
             System.out.printf("%-15s %-15s %-15s\n", proveedores[i], ciudades[i], numeroArticulos[i]);
         }

         System.out.print("\nIngrese el nombre del proveedor para consultar información: ");
         String nombreProveedorConsulta = leer.nextLine();

         boolean proveedorEncontrado = false;
         for (int i = 0; i < proveedores.length; i++) {
             if (proveedores[i].equalsIgnoreCase(nombreProveedorConsulta)) {
                 System.out.println("Información del Proveedor:");
                 System.out.println("Nombre del Proveedor: " + proveedores[i]);
                 System.out.println("Ciudad: " + ciudades[i]);
                 System.out.println("Número de Artículos: " + numeroArticulos[i]);
                 proveedorEncontrado = true;
                 break;
             }
         }

         if (!proveedorEncontrado) {
             System.out.println("Proveedor no encontrado.");
         }

         System.out.print("\nIngrese el nombre del proveedor que cambió de domicilio: ");
         String nombreProveedorCambioCiudad = leer.nextLine();


         boolean ciudadActualizada = false;
         for (int i = 0; i < proveedores.length; i++) {
             if (proveedores[i].equalsIgnoreCase(nombreProveedorCambioCiudad)) {
                 System.out.print("Ingrese el nuevo nombre de la ciudad: ");
                 String nuevaCiudad = leer.nextLine();
                 ciudades[i] = nuevaCiudad;
                 System.out.println("Ciudad actualizada correctamente.");
                 ciudadActualizada = true;
                 break;
             }
         }

         if (!ciudadActualizada) {
             System.out.println("Proveedor no encontrado.");
         }

         System.out.println("\nProveedores Después de Actualizar la Ciudad:");
         for (int i = 0; i < proveedores.length; i++) {
             System.out.printf("%-15s %-15s %-15s\n", proveedores[i], ciudades[i], numeroArticulos[i]);
         }

         System.out.print("\nIngrese el nombre del proveedor para actualizar el número de artículos: ");
         String nombreProveedorActualizarArticulos = leer.nextLine();

         boolean articulosActualizados = false;
         for (int i = 0; i < proveedores.length; i++) {
             if (proveedores[i].equalsIgnoreCase(nombreProveedorActualizarArticulos)) {
                 System.out.print("Ingrese el nuevo número de artículos: ");
                 int nuevoNumeroArticulos = leer.nextInt();
                 numeroArticulos[i] = nuevoNumeroArticulos;
                 System.out.println("Número de artículos actualizado correctamente.");
                 articulosActualizados = true;
                 break;
             }
         }

         if (!articulosActualizados) {
             System.out.println("Proveedor no encontrado.");
         }

         System.out.println("\nProveedores Después de Actualizar el Número de Artículos:");
         for (int i = 0; i < proveedores.length; i++) {
             System.out.printf("%-15s %-15s %-15s\n", proveedores[i], ciudades[i], numeroArticulos[i]);
         }
	}
	public static void ejecutarEjercicio86(){
 		Scanner leer = new Scanner(System.in);
 		System.out.println("");
 		 System.out.print("Ingrese el número de profesores: ");
         int numProfesores = leer.nextInt();

         String[] nombres = new String[numProfesores];
         char[] sexos = new char[numProfesores];
         int[] edades = new int[numProfesores];

   
         for (int i = 0; i < numProfesores; i++) {
             System.out.println("\nIngrese información del profesor " + (i + 1) + ":");
             leer.nextLine(); 

             System.out.print("Nombre: ");
             nombres[i] = leer.nextLine();

             System.out.print("Sexo (M/F): ");
             sexos[i] = leer.next().charAt(0);

             System.out.print("Edad: ");
             edades[i] = leer.nextInt();
         }

  
         double sumaEdades = 0;
         for (int edad : edades) {
             sumaEdades += edad;
         }
         double edadPromedio = sumaEdades / numProfesores;

       
         int indiceMasJoven = 0;
         for (int i = 1; i < edades.length; i++) {
             if (edades[i] < edades[indiceMasJoven]) {
                 indiceMasJoven = i;
             }
         }

      
         int indiceMasEdad = 0;
         for (int i = 1; i < edades.length; i++) {
             if (edades[i] > edades[indiceMasEdad]) {
                 indiceMasEdad = i;
             }
         }

 
         int contadorProfesorasMayoresAlPromedio = 0;
         for (int i = 0; i < numProfesores; i++) {
             if (sexos[i] == 'F' && edades[i] > edadPromedio) {
                 contadorProfesorasMayoresAlPromedio++;
             }
         }

       
         int contadorProfesoresMenoresAlPromedio = 0;
         for (int i = 0; i < numProfesores; i++) {
             if (edades[i] < edadPromedio) {
                 contadorProfesoresMenoresAlPromedio++;
             }
         }

         System.out.println("\nEdad promedio del grupo de profesores: " + edadPromedio);
         System.out.println("Nombre del profesor más joven: " + nombres[indiceMasJoven]);
         System.out.println("Nombre del profesor con más edad: " + nombres[indiceMasEdad]);
         System.out.println("Número de profesoras con edad mayor al promedio: " + contadorProfesorasMayoresAlPromedio);
         System.out.println("Número de profesores con edad menor al promedio: " + contadorProfesoresMenoresAlPromedio);
	}
	public static void ejecutarEjercicio88(){
 		Scanner leer = new Scanner(System.in);
 		System.out.println("");
 		

        System.out.print("Ingrese la cantidad de clientes: ");
        int numClientes = leer.nextInt();

        int[] codigosClientes = new int[numClientes];
        int[] pagarésPendientes = new int[numClientes];
        int[] montoCancelarPorPagaré = new int[numClientes];
        int[] cantidadCancelar;
        int[] montoTotalPagado;

        for (int i = 0; i < numClientes; i++) {
            System.out.print("Ingrese el código del cliente " + (i + 1) + ": ");
            codigosClientes[i] = leer.nextInt();

            System.out.print("Ingrese la cantidad de pagarés pendientes para el cliente " + (i + 1) + ": ");
            pagarésPendientes[i] = leer.nextInt();

            System.out.print("Ingrese el monto a cancelar por pagaré para el cliente " + (i + 1) + ": ");
            montoCancelarPorPagaré[i] = leer.nextInt();

            if (pagarésPendientes[i] < 0 || montoCancelarPorPagaré[i] < 0) {
                System.out.println("Error: La cantidad de pagarés o el monto a cancelar no pueden ser negativos.");
                i--;
            }
        }

        System.out.print("\nIngrese el código del cliente para cancelar pagarés: ");
        int codigoCancelar = leer.nextInt();

        int indiceCliente = -1;
        for (int i = 0; i < numClientes; i++) {
            if (codigosClientes[i] == codigoCancelar) {
                indiceCliente = i;
                break;
            }
        }

        if (indiceCliente == -1) {
            System.out.println("Cliente no encontrado.");
        } else {
            System.out.print("Ingrese la cantidad de pagarés a cancelar: ");
            int cantidadPagarésCancelar = leer.nextInt();

            if (cantidadPagarésCancelar < 0 || cantidadPagarésCancelar > pagarésPendientes[indiceCliente]) {
                System.out.println("Error: Cantidad de pagarés a cancelar no válida.");
            } else {
                pagarésPendientes[indiceCliente] -= cantidadPagarésCancelar;
                cantidadCancelar = new int[]{cantidadPagarésCancelar};
                montoTotalPagado = new int[]{cantidadPagarésCancelar * montoCancelarPorPagaré[indiceCliente]};

                System.out.println("\nListado de Clientes que Cancelaron Pagarés:");
                System.out.printf("%-15s %-25s %-25s %-20s\n", "Código Cliente", "Pagarés Pendientes", "Pagarés Cancelados", "Monto Total Pagado");

                for (int i = 0; i < numClientes; i++) {
                    if (cantidadCancelar[i] > 0) {
                        System.out.printf("%-15s %-25s %-25s %-20s\n", codigosClientes[i], pagarésPendientes[i], cantidadCancelar[i], montoTotalPagado[i]);
                    }
                }
            }
        }
 		
	}
}
