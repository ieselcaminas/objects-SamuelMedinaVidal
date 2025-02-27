package Ej5Banco2;

public class Domiciliacion {
    private String nDomiciliacion;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(String nDomiciliacion, CuentaCorriente cuentaCorriente) {
        this.nDomiciliacion = nDomiciliacion;
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString() {
        return "Domiciliacion{" +
                "nDomiciliacion='" + nDomiciliacion + '\'' +
                ", cuentaCorriente=" + cuentaCorriente +
                '}';
    }
}
