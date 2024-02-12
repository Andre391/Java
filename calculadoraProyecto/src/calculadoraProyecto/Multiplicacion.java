package calculadoraProyecto;

public class Multiplicacion extends Operacion {

	public Multiplicacion(double num1, double num2) {
		super(num1, num2);
		
	}

	@Override
	public double ejecutar() {
		return num1 * num2;
	}

}
