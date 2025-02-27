package Ej5Banco2;

public class Sucursal {
    private String nSucursal;
    private Banco banco;

    public Sucursal(String nSucursal, Banco banco) {
        this.nSucursal = nSucursal;
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nSucursal='" + nSucursal + '\'' +
                ", banco=" + banco +
                '}';
    }
}
