package employee;

import appointments.Appointment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import appointments.*;

enum EmployeeType {
    DOCTOR, STYLIST
}

public class Employee {
    protected String name;
    protected String surname;
    protected EmployeeType type;
    protected List<String> workdays = new ArrayList<>();

    protected ArrayList<Appointment> schedule = new ArrayList<>();

    protected Employee(String name,String surname, EmployeeType type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public void setWorkDays(String ...days) {
        workdays.addAll(Arrays.asList(days));
    }

    public List<String> getWorkDays() {
        return workdays;
    }

    public String getName() {
        return this.name;
    }

    public EmployeeType getType() {
        return this.type;
    }

    protected void newSchuduledAppointment(AppointType type, LocalDate date) {
        Appointment newAppointment = new Appointment(type, date);
        this.schedule.add(newAppointment);
    }
}
