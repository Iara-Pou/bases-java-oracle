package java_primeros_pasos;

public class EjemploCondicionalesImpuestos {
	public static void main(String[] args) {
		double salario = 3300.0;
		double porcentajeImpuesto = 0;
		double impuestoFinal = 0;
		
		boolean menorRangoSalarial = salario > 0 && salario <= 2800;
		boolean medioRangoSalarial = salario >= 2800.01 && salario <= 3751;
		boolean mayorRangoSalarial = salario >= 3751.01 && salario <= 4664;
		
		if(menorRangoSalarial) {
			porcentajeImpuesto = 7.5;
		} else if(medioRangoSalarial) {
			porcentajeImpuesto = 15;
		} else if(mayorRangoSalarial) {
			porcentajeImpuesto = 22.5;
		}
		
		impuestoFinal = (salario * porcentajeImpuesto) / 100;
		System.out.println(impuestoFinal);
		
	}
}
