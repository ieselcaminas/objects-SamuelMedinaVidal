package Person;

public class Student extends Person {
    private int credits;

    public Student(String nombre, String direccion, String dni) {
        super(nombre, direccion, dni);
        this.credits = 0;
    }

    public void study() {
        this.credits++;
    }

    public int getCredits() { // Cambio de nombre siguiendo convenciones
        return this.credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudy credits: " + credits;
    }
}
