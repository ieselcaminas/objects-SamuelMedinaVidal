package Ej5Banco2;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Central");
        Sucursal sucursal = new Sucursal("Sucursal 001", banco);
        Cliente cliente1 = new Cliente("12345678A");
        Cliente cliente2 = new Cliente("87654321B");

        CuentaCorriente cuenta1 = new CuentaCorriente("CC001", sucursal);
        CuentaCorriente cuenta2 = new CuentaCorriente("CC002", sucursal);

        cuenta1.agregarCliente(cliente1);
        cuenta1.agregarCliente(cliente2);
        cuenta2.agregarCliente(cliente1);

        Prestamo prestamo1 = new Prestamo("P001", sucursal, cliente1);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cuenta1);
        System.out.println(prestamo1);
    }
}
