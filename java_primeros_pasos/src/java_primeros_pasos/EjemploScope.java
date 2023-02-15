package java_primeros_pasos;

public class EjemploScope {
	public static void main (String[] args) {
		int edad = 19;
		boolean esMenor;
		
		if(edad<=18) {
			esMenor = true;
		} else {
			esMenor = false;
		}
		
		System.out.println(esMenor);
		
	}
}
