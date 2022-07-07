package employee;

public abstract class Employee {
    protected String name;
    protected String surname;

    public Employee(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }
}
