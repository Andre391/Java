package main;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0,c=0;
		Scanner lapiz= new Scanner(System.in);
		
		System.out.println("Digite un numero para a: ");
		a=lapiz.nextInt();
		System.out.println("Digite un numero para b: ");
		b=lapiz.nextInt();
		System.out.println("Digite un numero para c: ");
		c=lapiz.nextInt();
	
		if(a>b) {
			if(a>c) {
				System.out.println("a es mayor");
			}else {
				System.out.println("C es Mayor");
			}
		}else {
			if(b>c) {
				System.out.println("b es mayor");
			}else {
				System.out.println("C es Mayor");
				
			}
			
		}
		lapiz.close();
	}

}
