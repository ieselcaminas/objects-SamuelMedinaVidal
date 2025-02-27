package Ej2AireAcondicionado;

public class AireAcondicionado {
    private String nombre;
    private double temperatura;
    private double temperaturaMaxima;
    private double temperaturaMinima;

    public AireAcondicionado(String nombre, double temperaturaMaxima, double temperaturaMinima) {
        this.nombre = nombre;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.temperatura = temperaturaMinima;
    }

    public void setTemperatura(double temperatura) {
        if (temperatura >= temperaturaMinima && temperatura <= temperaturaMaxima) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Temperatura fuera de rango. Debe estar entre " +
                    temperaturaMinima + " y " + temperaturaMaxima + ".");
        }
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void subirAireAcondicionado() {
        if (temperatura < temperaturaMaxima) {
            temperatura++;
        } else {
            System.out.println("Ya está en la temperatura máxima.");
        }
    }

    public void bajarAireAcondicionado() {
        if (temperatura > temperaturaMinima) {
            temperatura--;
        } else {
            System.out.println("Ya está en la temperatura mínima.");
        }
    }

    @Override
    public String toString() {
        return "AireAcondicionado{" +
                "nombre='" + nombre + '\'' +
                ", temperatura=" + temperatura +
                ", temperaturaMaxima=" + temperaturaMaxima +
                ", temperaturaMinima=" + temperaturaMinima +
                '}';
    }
}
