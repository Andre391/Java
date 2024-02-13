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
	 double num1=0, num2 = 0;
	 while(true) {
		 System.out.println("__CALCULADORA__");
		 System.out.println("INGRESE LA OPERACION QUE SE QUIERE REALIZAR:\n"
				 +"___|+|Suma___\n"
				 +"___|-|Resta___\n"
				 +"___|*|Multiplicacion___\n"
				 +"___|/|Division___\n"
				 + "___|%|Porcentaje___\n"
				 + "___|r|Raiz___\n"
				 );
		 
		 System.out.println("Ingrese operación o 'a' para salir; ");
		 String operacion = leer.nextLine();
		 
		 if(operacion.equals("a")) {
			 System.out.println("Ha salido del Programa");
			 break;
		 }
		 
		 
		 System.out.println("(Si existe el ans)Desea utilizar el ans? s/n: ");
		 String utians= leer.nextLine();
		 if(utians.equals("s")) {
			 num1 = calculadora.getAns();
		 }else {
			 
		 
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
         case "%":
             System.out.println("Resultado: " + calculadora.calcular(new Porcentaje(num1, num2), num1, num2)+ " %");
             break;
         case "r":;
             System.out.println("Resultado: " + calculadora.calcular(new Raiz(num1, num2), num1, num2));
             break;
         default:
             System.out.println("Operación no válida");
             break;
     }
		 }
         System.out.println("ANS: " + calculadora.getAns());
     }
	 }
 }

