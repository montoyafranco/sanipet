package employee;

import appointments.Appointment;
import java.util.ArrayList;
import java.util.Arrays;

import appointments.*;

public abstract class Employee {
    protected String name;
    protected String surname;

//  workdays = LMMS
    protected ArrayList<Appointment> schedule = new ArrayList<>();

    /*
    a  LMM
    b  LJV
    c  LMMS

    9 / 7 / 2022
    satuday;
    employees.contains("S");
    What doctor do you want?
    1. c

    c.newSchuduledAppointment();

    * */

    protected Employee(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected void newSchuduledAppointment(AppointType type, String date) {
        Appointment newAppointment = new Appointment(type, date);
        this.schedule.add(newAppointment);
    }
}
