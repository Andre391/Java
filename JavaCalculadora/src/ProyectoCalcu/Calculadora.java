package ProyectoCalcu;

import java.util.Scanner;

public abstract class Calculadora {
	 static Scanner leer = new Scanner(System.in);
	public static double ans;
	public static void main(String[] args) {
		
		
		Operacion calculadora = new Operacion();
		while(true){
            calculadora.menu();
            calculadora.realizarOperacion();
            System.out.println("Resultado: " + calculadora.resultado());      
            
            }
	
		
		}
	public abstract double resultado();
	
	public abstract void menu();
	
	public abstract void realizarOperacion();
	
}
