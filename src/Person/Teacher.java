package Person;

public class Teacher extends Person {
    private int salary;

    public Teacher(String nombre, String direccion, String dni, int salary) {
        super(nombre, direccion, dni);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary + " euro/month";
    }
}
