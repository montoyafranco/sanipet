package employee;

import appointments.Appointment;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Employee {
    protected String name;
    protected String surname;
    public ArrayList<Appointment> schedule = new ArrayList<>();

    public Employee(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }
}
