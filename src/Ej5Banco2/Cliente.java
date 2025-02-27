package Ej5Banco2;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String dni;
    private Set<CuentaCorriente> cuentas;
    private Set<Prestamo> prestamos;

    public Cliente(String dni) {
        this.dni = dni;
        this.cuentas = new HashSet<>();
        this.prestamos = new HashSet<>();
    }

    public void agregarCuenta(CuentaCorriente cuenta) {
        cuentas.add(cuenta);
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", cuentas=" + cuentas +
                ", prestamos=" + prestamos +
                '}';
    }
}
