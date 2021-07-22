import claseempleado.Empleado;
import interfazdeducciones.Deducciones;

public class ClasePrincipal {

	public static void main(String[] args) {
		Empleado em = new Empleado("Mauricio", 5000000);
		System.out.println("Nombre empleado: " + em.getNombreemp());
		
		//Implemetación de la expresión Lambda
		Deducciones lambda = (salarioemp) -> {
			double deductotales = 0;
			double decRet = 0;
			double decSalud = deductotales + (salarioemp * 0.04);
			double decSPension = deductotales + (salarioemp * 0.04);

			if (salarioemp >= 2500000) {
				decRet = deductotales + (salarioemp * 0.015);
				deductotales = deductotales + decRet;
			}
			System.out.println("Descuento x salud: " + decSalud);
			System.out.println("Descuento x Pensión: " + decSPension);
			System.out.println("Descuento x ReteFuente: " + decRet);

			deductotales = deductotales + decSalud + decSPension;
			return deductotales;
		};

		double deducciones = lambda.deduccionesSalario(em.getSalabruto());

		System.out.println("Salario bruto: " + em.getSalabruto());

		System.out.println("Salario neto a pagar: " + em.calculoSalaNeto(deducciones));

	}

}
