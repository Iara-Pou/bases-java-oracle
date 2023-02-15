package java_primeros_pasos;

public class CaracteresStrings {
	public static void main(String[] args) {
//		char caracter = 124;
//		System.out.print(caracter);
//		
//		int nro = caracter;
//		System.out.print(nro);
//		
//		char caracterCombinandoIntChar =  (char) (nro + 1);
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 'a' + 'b';
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);

        String frase = "Alura cursos online de tecnología";
        System.out.println(frase);
        
        
        char caracter = 'a' + '1'; //funciona`
//        char segundoCaracter = caracter + ((char)1); //no funciona
        char segundoCaracter = (char)(caracter + 1); //funciona`
	}
}
