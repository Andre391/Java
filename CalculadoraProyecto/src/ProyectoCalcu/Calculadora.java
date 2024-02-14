package ProyectoCalcu;

public abstract class Calculadora {
	public static void main(String[] args) {
		
		OperacionBasica calculadora = new OperacionBasica();
		while (true) {
            calculadora.menu();
            calculadora.realizarOperacion();
            System.out.println("Resultado: " + calculadora.resultado());
	}
}
	public abstract double resultado();
	
	public abstract void menu();
	
	public abstract void realizarOperacion();
}
