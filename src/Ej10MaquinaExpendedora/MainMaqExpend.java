package Ej10MaquinaExpendedora;

public class MainMaqExpend {
    public static void main(String[] args){
        MaquinaExpendedora maq1 = new MaquinaExpendedora(140, 700);
        maq1.setDinero(120);
        maq1.addDinero(140);
        System.out.println(maq1.tique());
        System.out.println(maq1.getCajon());
    }
}
