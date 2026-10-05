package ar.edu.unlp.oo1.ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fecha;
	private double montoDepositado;
	private double porcentajeInteres;

	public PlazoFijo(LocalDate fecha, double montoDepositado, double porcentajeDeInteres) {
		this.fecha = fecha;
		this.montoDepositado = montoDepositado;
		this.porcentajeInteres = porcentajeDeInteres;
	}
	
	public double valorActual() {
		double cantDias = ChronoUnit.DAYS.between(fecha, LocalDate.now());
		return this.montoDepositado + (this.montoDepositado * this.porcentajeInteres * cantDias);
	}
}
