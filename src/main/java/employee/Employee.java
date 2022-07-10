package employee;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import Sanipet.Patient;
import appointments.*;
import Medicines.Medicine;

public class Employee {
    protected String name;
    protected String surname;
    protected EmployeeType type;
    protected List<String> workdays = new ArrayList<>();
    protected ArrayList<Appointment> schedule = new ArrayList<>();

    protected Employee(String name, String surname, EmployeeType type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public void finishAppointment(Appointment appoint) {
        Medicine selectedMedicine = Resources.selectMedicines();
        appoint.setMedicine(selectedMedicine);
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

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public EmployeeType getType() {
        return this.type;
    }

    public void newSchuduledAppointment(AppointType appointmentType, LocalDate date, Patient pet) {
        Appointment newAppointment = new Appointment(pet, appointmentType, date, this);
        this.schedule.add(newAppointment);
    }
}
