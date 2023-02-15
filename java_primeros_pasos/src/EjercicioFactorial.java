package java_primeros_pasos;

public class EjercicioFactorial {

	public static void main(String[] args) {
		int nroInicial = 3;
		int factorial = 1;
		for (int i = 1; i <= nroInicial; i++) {
			factorial *= i;
			
		}
		System.out.println(factorial);
	}

}
