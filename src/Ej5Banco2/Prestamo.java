package Ej5Banco2;

public class Prestamo {
    private String nPrestamo;
    private Sucursal sucursal;
    private Cliente cliente;

    public Prestamo(String nPrestamo, Sucursal sucursal, Cliente cliente) {
        this.nPrestamo = nPrestamo;
        this.sucursal = sucursal;
        this.cliente = cliente;
        cliente.agregarPrestamo(this);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "nPrestamo='" + nPrestamo + '\'' +
                ", sucursal=" + sucursal +
                ", cliente=" + cliente +
                '}';
    }
}
