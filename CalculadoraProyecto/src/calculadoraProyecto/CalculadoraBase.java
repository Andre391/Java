package calculadoraProyecto;

public class CalculadoraBase implements IOperacion{
	private double ans;

	
	public void setAns(double ans) {
		this.ans = ans;
	}

	@Override
	public double sumar(double num1, double num2) {
		ans = num1 + num2;
		return ans;
	}

	@Override
	public double restar(double num1, double num2) {
		ans = num1 - num2;
		return ans;
	}

	@Override
	public double multiplicar(double num1, double num2) {
		ans = num1 * num2;
		return ans;
	}

	@Override
	public double dividir(double num1, double num2) {
		
		if(num2 != 0) {
			ans = num1/num2;
			return ans;
		}else {
			System.out.println("Error : División por cero");
			return Double.NaN;
		}
	}

	@Override
	public double porcentaje(double num, double porcentaje) {
		ans = (num * porcentaje)/100;
		return ans;
	}

	@Override
	public double elevar(double base, double exponente) {
		ans = Math.pow(base, exponente);
        return ans;
	}

	@Override
	public double raizCuadrada(double num) {
      if (num >= 0) {
            ans = Math.sqrt(num);
            return ans;
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }
	}

	@Override
	public double seno(double anguloEnGrados) {
	  	ans = Math.sin(Math.toRadians(anguloEnGrados));
        return ans;
	}

	@Override
	public double coseno(double anguloEnGrados) {
		ans= Math.cos(Math.toRadians(anguloEnGrados));
		return ans;
	}

	@Override
	public double tangente(double anguloEnGrados) {
		ans= Math.tan(Math.toRadians(anguloEnGrados));
		return ans;
	}
	
	  public double getAns() {
	        return ans;
	    }
}
