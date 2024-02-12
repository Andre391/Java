package calculadoraProyecto;

public class Suma extends Operacion{

	public Suma(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double ejecutar() {
		return num1 + num2;
	}

}
