package java_primeros_pasos;

public class EjemploWhile {
	public static void main(String[] args) {
		int contador = 1;
		int totalNumeros = 0;
		
		while (contador <= 10) {
			System.out.println(contador);
			totalNumeros += contador;
			contador++;
		}
		
		System.out.println(totalNumeros);
	}
}
