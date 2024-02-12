package calculadoraProyecto;

public class Division extends Operacion {

	public Division(double num1, double num2) {
		super(num1, num2);
		 
	}

	@Override
	public double ejecutar() {
		if(num2 != 0) {
			return num1/num2;
		}else {
			System.out.println("Error : División por cero");
			return Double.NaN;
		}
	}

}
