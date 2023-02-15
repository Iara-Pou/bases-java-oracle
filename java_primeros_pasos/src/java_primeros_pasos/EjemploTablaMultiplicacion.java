package java_primeros_pasos;

public class EjemploTablaMultiplicacion {
	public static void main(String[] args) {
		int numeroTabla = 1;
		while (numeroTabla <= 10) {
			System.out.println("\ntabla del " + numeroTabla);
			for (int multiplo = 0; multiplo <= 10; multiplo++) {
				int resultadoMultiplicacion = numeroTabla * multiplo;
				System.out.println(numeroTabla + " x " + multiplo + " = " + resultadoMultiplicacion);
			}
			System.out.println("---------------");
			numeroTabla++;
		}
	}
}