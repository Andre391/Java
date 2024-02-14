package calculadoraProyecto;

public interface IOperacion {
	 	double sumar(double num1, double num2);
	    double restar(double num1, double num2);
	    double multiplicar(double num1, double num2);
	    double dividir(double num1, double num2);
	    double porcentaje(double num, double porcentaje);
	    double elevar(double base, double exponente);
	    double raizCuadrada(double num);
	    double seno(double anguloEnGrados);
	    double coseno(double anguloEnGrados);
	    double tangente(double anguloEnGrados);
	    
	    
}
