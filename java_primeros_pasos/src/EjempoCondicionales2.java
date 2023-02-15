package java_primeros_pasos;

public class EjempoCondicionales2 {
	public static void main(String[] args) {

		int edad = 15;
		int cantidadPersonas = 2;

		boolean esMayor = edad >= 18;
		boolean estaAcompaniado = cantidadPersonas >= 2;
		boolean puedeEntrar = esMayor || estaAcompaniado;

		if (puedeEntrar) {
			System.out.println("Podés pasar.");
		} else {
			System.out.println("Sos menor de edad, no podés pasar.");
		}
		
	}
}
