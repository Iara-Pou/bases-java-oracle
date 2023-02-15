package java_primeros_pasos;

public class EjemploCondicionales {
	public static void main(String[] args) {

		int edad = 15;
		int cantidadPersonas = 2;

		if (edad >= 18) {
			System.out.println("Sos mayor de edad, podés pasar.");
		} else if (edad < 18 && cantidadPersonas >= 2) {
			System.out.println("Estás acompañado, podés pasar aunque seas menor.");
		} else {
			System.out.println("Sos menor de edad, no podés pasar.");
		}
		
	}
}
