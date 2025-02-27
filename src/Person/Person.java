package Person;

public class Person {
    protected String nombre;
    protected String direccion;
    protected String dni;

    public Person(String nombre, String direccion, String dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        setDni(dni);
    }

    public void setDni(String dni) {
        if (comprobarDNI(dni)) {
            this.dni = dni;
        } else {
            throw new IllegalArgumentException("DNI incorrecto");
        }
    }

    private boolean comprobarDNI(String dni) {
        if (dni == null || !dni.matches("\\d{8}[A-Za-z]")) {
            return false;
        }
        String numeros = dni.substring(0, 8);
        char letra = Character.toUpperCase(dni.charAt(8));
        int num = Integer.parseInt(numeros);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(num % 23) == letra;
    }

    @Override
    public String toString() {
        return nombre + "\n" + (direccion != null ? direccion : "Sin dirección") + "\nDNI: " + (dni != null ? dni : "No asignado");
    }
}
