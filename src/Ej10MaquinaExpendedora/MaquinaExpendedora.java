package Ej10MaquinaExpendedora;

public class MaquinaExpendedora {
    private int precio;
    private int cajon;
    private int dinero;

    public MaquinaExpendedora(int precio, int cajon) {
        this.precio = precio;
        this.cajon = cajon;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public void addDinero(int dinero){
        this.dinero += dinero;
    }
    public String tique(){
        if(this.cajon >= this.dinero - this.precio) {
            this.cajon += this.precio;
            String devolver = getDevolver();
            return "Tique\n" + devolver;
        }else if(this.dinero < this.precio){
            return "Introduzca: " + (this.precio - this.dinero);
        }else{
            return "Introduzca el importe exacto";
        }
    }
    private String getDevolver() {
        String devolver = "";
        if (this.dinero > this.precio) {
            int[] centimos = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
            int reembolso = this.dinero - this.precio;
            for (int i = 0; i < centimos.length; i++) {
                int division = reembolso / centimos[i];
                reembolso = reembolso % centimos[i];
                while (division != 0) {
                    if (centimos[i] == 1000) {
                        devolver += "10€ ";
                    } else if (centimos[i] == 500) {
                        devolver += "5€ ";
                    } else if (centimos[i] == 200) {
                        devolver += "2€ ";
                    } else if (centimos[i] == 100) {
                        devolver += "1€ ";
                    } else if (centimos[i] == 50) {
                        devolver += "0.5€ ";
                    } else if (centimos[i] == 20) {
                        devolver += "0.20€ ";
                    } else if (centimos[i] == 10) {
                        devolver += "0.10€ ";
                    } else if (centimos[i] == 5) {
                        devolver += "0.05€ ";
                    } else if (centimos[i] == 2) {
                        devolver += "0.02€ ";
                    } else if (centimos[i] == 1) {
                        devolver += "0.01€ ";
                    }
                    division--;
                }
            }
        }
        return devolver;
    }
}
