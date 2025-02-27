package Ej5Banco2;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente {
    private String nCuentaCorriente;
    private Sucursal sucursal;
    private Set<Cliente> clientes;

    public CuentaCorriente(String nCuentaCorriente, Sucursal sucursal) {
        this.nCuentaCorriente = nCuentaCorriente;
        this.sucursal = sucursal;
        this.clientes = new HashSet<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        cliente.agregarCuenta(this);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "nCuentaCorriente='" + nCuentaCorriente + '\'' +
                ", sucursal=" + sucursal +
                ", clientes=" + clientes +
                '}';
    }
}
