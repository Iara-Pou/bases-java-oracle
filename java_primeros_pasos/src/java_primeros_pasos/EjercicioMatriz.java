package java_primeros_pasos;

import java.util.Iterator;

public class EjercicioMatriz {
	public static void main(String[] args) {
		for(int fila = 0; fila <=10; fila ++) {
			for(int columna = 0; columna <=fila; columna++) {
				System.out.print("*");
				if(columna >= fila) {
					break;
				}				
			}
			System.out.println();
		}
	}
}
