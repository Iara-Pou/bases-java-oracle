package java_primeros_pasos;

public class EjercicioMultiplos {

	public static void main(String[] args) {
		int multiplo = 3;
		for(int contador = 1; contador <=100; contador ++) {
			boolean numeroEsMultiplo = contador % multiplo == 0;
			if(numeroEsMultiplo) {
				System.out.println(contador);
			}
		}

	}
}
