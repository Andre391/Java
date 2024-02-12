package calculadoraProyecto;

import java.util.Scanner;

public class Calculadora {
 private double ans = 0;
 
 public double calcular(Operacion operacion, double num1, double num2 ) {
	 double resultado = operacion.ejecutar();
	 ans= resultado;
	 return resultado;
 }
 
 public double getAns() {
	 return ans;
 }
 
 public static void main(String[] args) {
	 Scanner leer = new Scanner(System.in);
	 Calculadora calculadora = new Calculadora();
	 
	 while(true) {
		 System.out.println("Ingrese operación(+, - , *, /) o 'a' para salir; ");
		 String operacion = leer.nextLine();
		 
		 if(operacion.equals("a")) {
			 System.out.println("Ha salido del Programa");
			 break;
		 }
		 
		 double num1;
		 System.out.println("(Si existe el ans)Desea utilizar el ans? s/n: ");
		 String utians= leer.nextLine();
		 if(utians.equals("s")) {
			 num1 = calculadora.getAns();
		 }else {
			 System.out.println("Ingrese el primer número:");
	         num1 = leer.nextDouble();
	         leer.nextLine(); 
		 }
         
         System.out.println("Ingrese el segundo número:");
         double num2 = leer.nextDouble();
         leer.nextLine();
        
         
         switch (operacion) {
         case "+":
             System.out.println("Resultado: " + calculadora.calcular(new Suma(num1, num2), num1, num2));
             break;
         case "-":
             System.out.println("Resultado: " + calculadora.calcular(new Resta(num1, num2), num1, num2));
             break;
         case "*":
             System.out.println("Resultado: " + calculadora.calcular(new Multiplicacion(num1, num2), num1, num2));
             break;
         case "/":
             System.out.println("Resultado: " + calculadora.calcular(new Division(num1, num2), num1, num2));
             break;
         default:
             System.out.println("Operación no válida");
             break;
     }
         System.out.println("ANS: " + calculadora.getAns());
     }
	 }
 }
