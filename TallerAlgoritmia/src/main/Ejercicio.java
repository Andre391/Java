package main;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lapiz = new Scanner(System.in);
        int opcion;

        do {
        	System.out.println("EJERCICIOS DE ESTRUCTURA SECUENCIAL:  ");
            System.out.println("1. Ejercicio 2");
            System.out.println("2. Ejercicio 4");
            System.out.println("3. Ejercicio 6");
            System.out.println("4. Ejercicio 8");
            System.out.println("5. Ejercicio 10");
            System.out.println("6. Ejercicio 12");
            System.out.println("7. Ejercicio 14");
            System.out.println("8. Ejercicio 16");
            System.out.println("9. Ejercicio 18");
            System.out.println("10. Ejercicio 20");
            System.out.println("11. Ejercicio 22");
            System.out.println("0. Salir");

            System.out.print("Seleccione el ejercicio que desea ejecutar (0 para salir): ");
            opcion = lapiz.nextInt();

            
            switch (opcion) {
                case 1:
                    ejecutarEjercicio2();
                    break;
                case 2:
                    ejecutarEjercicio4();
                    break;
                case 3:
                    ejecutarEjercicio6();
                    break;
                case 4:
                    ejecutarEjercicio8();
                    break;
                case 5:
                    ejecutarEjercicio10();
                    break;
                case 6:
                    ejecutarEjercicio12();
                    break;
                case 7:
                    ejecutarEjercicio14();
                    break;
                case 8:
                    ejecutarEjercicio16();
                    break;
                case 9:
                    ejecutarEjercicio18();
                    break;
                case 10:
                    ejecutarEjercicio20();
                    break;
                case 11:
                    ejecutarEjercicio22();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);

	}
	
	public static void ejecutarEjercicio2() {
		Scanner lapiz = new Scanner(System.in);
		System.out.println("");
		double razon = 0.0;
		System.out.println("Ejercicio 2");
	int capital=0;
	
	
	System.out.print("Cual es su capital a invertir?: ");
	capital= lapiz.nextInt();
	
	 razon= capital * 0.02;
	
	System.out.println("La razon que dara el banco es del 2% la cual es:" + razon);	
	
	double totalMensual= capital+razon;
	
	System.out.println("Se ganara despues de un mes un total de: "+ totalMensual);
	
	System.out.println("");

	}
	public static void ejecutarEjercicio4() {
		System.out.println("");
	System.out.println("Ejercicio 4");
	Scanner lapiz = new Scanner(System.in);
	int totalVenta=0;
	
	
	System.out.print("Cuál es el total de la venta?: ");
	totalVenta= lapiz.nextInt();
	
	int descuento= (totalVenta *15)/100;
	
	System.out.println("El descuento de su compra sera:" + descuento);	
	
	int totalPagar= totalVenta-descuento;
	
	System.out.println("El total de su compra es de: "+ totalPagar);
	System.out.println("");
	
	}
	public static void ejecutarEjercicio6() {
		System.out.println("");
		Scanner lapiz = new Scanner(System.in);
	System.out.println("Ejercicio 6");
	
	System.out.print("Cuantas mujeres tiene en su grupo de estudiantes?: ");
	int muj=lapiz.nextInt();
	
	System.out.print("Cuantas hombres tiene en su grupo de estudiantes?: ");
	int hom=lapiz.nextInt();
	
	int totalEstudiantes= muj + hom;
	
	double porcenMuj = ((double) muj / totalEstudiantes) * 100;
    double porcenHom = ((double) hom / totalEstudiantes) * 100;
    System.out.println("");
	
	System.out.println("El Total de estudiantes de su grupo es de: "+ totalEstudiantes);
	System.out.println("El porcentaje de Hombres es del: "+ porcenHom + "%");
	System.out.println("El porcentaje de Mujeres es del: "+ porcenMuj + "%");
	System.out.println("");
	}
	public static void ejecutarEjercicio8() {
		System.out.println("");
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("Ejercicio 8");
		
		System.out.print("Digite la Longitud de a: ");
		 double a= lapiz.nextDouble();
		System.out.print("Digite la Longitud de b: ");
		 double b= lapiz.nextDouble();
		System.out.print("Digite la Longitud de c: ");
		 double c= lapiz.nextDouble();
		
		 double p=(a+b+c)/2;
		
		double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println("");
		
		System.out.println("El area del Triangulo con los lados a: "+a+" b: "+b+" c: "+c);
		System.out.println("Es de un area total de: "+ area);
		System.out.println("");
	}
	
	public static void ejecutarEjercicio10() {
		System.out.println("");
		Scanner lapiz = new Scanner(System.in);
		System.out.println("Ejercicio 10");
		System.out.print("Digite la cantidad de Chelines Austriacos: ");
		double chelines = lapiz.nextDouble();
		double tasaPeseta = 9.56871;
		
		double cantPesetas = chelines * tasaPeseta;
		
		System.out.println("El equivalente en Pesetas es de: "+cantPesetas);
		System.out.println("");
		
		System.out.print("Digite la Cantidad de Dracmas Griegos: ");
		double dracmas = lapiz.nextDouble();
		double tasaPeseta1= 0.88607; //Pasetas de 1 Dracma Griego
		double tasaCambio=20.110; //Esta es la tasa de los Francos Franceses
		
		double cantFrancos = (dracmas*tasaPeseta1)/tasaCambio;
		
		System.out.println("El equivalente en Francos Franceses es de: "+ cantFrancos);
		
		System.out.println("");
		
		System.out.print("Digite la Cantidad de Pesetas: ");
		double peseta = lapiz.nextDouble();
		double tasaDolar = 122.449;
		double tasaLira = 9.289;
		
		 double cantDolar= peseta/tasaDolar;
	     double cantLira = peseta/tasaLira;
	     
	     System.out.println("El equivalente en Dolares es de: "+ cantDolar);
	     System.out.println("El equivalente en Liras Italianas es de: "+cantLira);
	     System.out.println("");
	}
	public static void ejecutarEjercicio12() {
		System.out.println("");
		Scanner lapiz = new Scanner(System.in);
		System.out.println("Ejercicio 12");
		
		System.out.print("Ingrese la nota del examen de Matemática: ");
        double notaMat = lapiz.nextDouble();
        System.out.print("Ingrese nota de la primera tarea de Matemática: ");
        double tareaMat1 = lapiz.nextDouble();
        System.out.print("Ingrese nota de la segunda tarea de Matemática: ");
        double tareaMat2 = lapiz.nextDouble();
        System.out.print("Ingrese nota de la tercera tarea de Matemática: ");
        double tareaMat3 = lapiz.nextDouble();

        // Calcular promedio Matemática
        double promTareasMat = (tareaMat1 + tareaMat2 + tareaMat3) / 3;
        double promMat = (0.9 * notaMat) +( 0.1 * promTareasMat);
        System.out.println("");
        System.out.print("Ingrese la nota del examen de Fisica: ");
        double notaFisi = lapiz.nextDouble();
        System.out.print("Ingrese nota de la primera tarea de Fisica: ");
        double tareaFisi1 = lapiz.nextDouble();
        System.out.print("Ingrese nota de la segunda tarea de Fisica: ");
        double tareaFisi2 = lapiz.nextDouble();
        
        // Calcular promedio Física
        double promTareasFisi = (tareaFisi1 + tareaFisi2 ) / 2;
        double promFisi = (0.8 * notaFisi) + (0.2 * promTareasFisi);
        System.out.println("");
        
        System.out.print("Ingrese la nota del examen de Quimica: ");
        double notaQui = lapiz.nextDouble();
        System.out.print("Ingrese nota de la primera tarea de Quimica: ");
        double tareaQui1 = lapiz.nextDouble();
        System.out.print("Ingrese nota de la segunda tarea de Quimica: ");
        double tareaQui2 = lapiz.nextDouble();
        System.out.print("Ingrese nota de la tercera tarea de Quimica: ");
        double tareaQui3 = lapiz.nextDouble();
        
        // Calcular promedio Química
        double promTareasQui = (tareaQui1 + tareaQui2 + tareaQui3) / 3;
        double promQui = (0.85 * notaQui )+ (0.15 * promTareasQui);

  

        // Imprimir resultados
        System.out.println("Su promedio general en Matemática es de: " + promMat);
        System.out.println("Su promedio general en Fisica es de: " + promFisi);
        System.out.println("Su promedio general en Quimica es de: " + promQui);
        System.out.println("");
	}
	public static void ejecutarEjercicio14() {
		System.out.println("");
		Scanner lapiz = new Scanner(System.in);
		System.out.println("Ejercicio 14");
		
		System.out.println("El sistema de ecuaciones es el siguiente");
		System.out.println("aX + bY = c");
		System.out.println("dX + eY = f");
		
		System.out.print("Digite el valor de a: ");
		 int a=lapiz.nextInt();
		System.out.print("Digite el valor de b: ");
		 int b=lapiz.nextInt();
		System.out.print("Digite el valor de c: ");
		 int c=lapiz.nextInt();
		System.out.print("Digite el valor de d: ");
		double d=lapiz.nextInt();
		System.out.print("Digite el valor de e: ");
		double e=lapiz.nextInt();
		System.out.print("Digite el valor de f: ");
		double f=lapiz.nextInt();
		
		System.out.println("");
		
		double  x=((c*e)-(b*f))/((a*e)-(b*d));
		
		double y=((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("El valor de X es: "+ x);
		System.out.println("El valor de Y es: "+ y);
		System.out.println("");
	}
	public static void ejecutarEjercicio16() {
		System.out.println("");
		Scanner lapiz = new Scanner(System.in);
		System.out.println("Ejercicio 16");
		
		System.out.println("Cuántas piezas saldran de una lamina?");
		
		double aLamina= 4 * 1.5;   //Area de la lamina que dan en el problema
		double aPieza= 0.5 * 1.5; //Area de la pieza 
		
		double piezasFabricadas= aLamina/aPieza;
		double desperdicio = aLamina -(piezasFabricadas * aPieza);
		
		System.out.println("La piezas que se pueden fabricar con una lamina es de: "+ piezasFabricadas);
		System.out.println("El desperdicio que se logra con la fabricación es de: "+ desperdicio);
		System.out.println("");
	}
	public  static void ejecutarEjercicio18() {
		System.out.println("");
		Scanner lapiz = new Scanner(System.in);
		System.out.println("Ejercicio 18");
		System.out.print("Digite los galones: ");
		double galones = lapiz.nextDouble();
		
		
		double litrosSurt = galones * 3785;//Se saca cuantos litros son en total de los galones digitados
		
		double cobro = litrosSurt * 100;
		
		System.out.println("Se le cobra al cliente: "+ cobro + " Bolívares ");
		System.out.println("");
	}
	
	public static void ejecutarEjercicio20() {
		System.out.println("");
		Scanner lapiz = new Scanner(System.in);
		System.out.println("Ejercicio 20");
		System.out.print("Cuál fue la cantidad que se le presto?: ");
		double x = lapiz.nextDouble();
		
		System.out.print("Cuál fue la cantidad de Intereses pagados?: ");
		double interesPago = lapiz.nextDouble();
		
		 double razon = (100 * interesPago)/ (x * 4); //el tiempo es de 4 años segun el ejercicio
		
		System.out.println("El porcentaje anual cobrado por el prestamo de " + x + " Fue del: "+razon + "%");
		System.out.println("");
	}
	
	public static void ejecutarEjercicio22() {
		System.out.println("");
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("Ejercicio 22");
		
		System.out.print("Digité el precio del computador: ");
		 double p = lapiz.nextDouble(); // Es el precio total del computador
		
		double t = p / 12; // la t es el valor de cada cuota 
		
		double porcentaje = (t/p) * 100; 
		
		System.out.println("El porcentaje que se cobra por el pago por cuotas es del: "+ porcentaje +"%");
		System.out.println("");
	}

}
