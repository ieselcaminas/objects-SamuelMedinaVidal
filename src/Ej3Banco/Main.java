package Ej3Banco;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Juan");
        Cuenta c2 = new Cuenta("Juanjo", 890.56);

        c1.setCantidad(33.33);

        c1.ingresar(10);

        c2.retirar(20.51);

        System.out.println(c1);
        System.out.println(c2);
    }
}
