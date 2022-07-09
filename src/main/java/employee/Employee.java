package employee;

import appointments.Appointment;
import java.util.ArrayList;
import java.util.Arrays;

import appointments.*;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected ArrayList<Appointment> schedule = new ArrayList<>();

    protected Employee(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected void newSchudule(AppointType type,AppointStatus status, String date) {
        Appointment newAppointment = new Appointment(type, status, date);
        this.schedule.add(newAppointment);
    }
}
