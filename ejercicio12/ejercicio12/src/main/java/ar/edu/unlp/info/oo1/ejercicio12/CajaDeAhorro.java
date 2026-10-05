package ar.edu.unlp.info.oo1.ejercicio12;

public class CajaDeAhorro extends Cuenta {
    private double comision = 0.02;

    public CajaDeAhorro() {
        super();
    }

    public void depositar(double monto) {
        super.depositar(monto - (monto * comision));
    }

    protected boolean puedeExtraer(double monto) {
    	return this.getSaldo() >= (monto + (monto * comision));
    }

    protected void extraerSinControlar(double monto) {
        super.extraerSinControlar(monto + (monto * comision));
    }
}
