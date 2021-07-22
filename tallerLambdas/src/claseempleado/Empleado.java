package claseempleado;

import interfazdeducciones.Deducciones;

public class Empleado {

	private String nombreemp;
	private double salarioemp;

	public Empleado() {

	}

	public Empleado(String nombreemp, double salarioemp) {

		this.nombreemp = nombreemp;
		this.salarioemp = salarioemp;

	}

	public String getNombreemp() {
		return nombreemp;
	}

	public void setNombreemp(String nombreemp) {
		this.nombreemp = nombreemp;
	}

	public double getSalabruto() {
		return salarioemp;
	}

	public void setSalabruto(double salabruto) {
		this.salarioemp = salabruto;
	}
	
	//Método para calcular el salario neto del empleado
	public double calculoSalaNeto(double deduc) {
		return this.salarioemp - deduc;

	}

}
