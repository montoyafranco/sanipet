package appointments;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import employee.Employee;

public class Appointment {
    private static List<Appointment> appointments = new ArrayList<>();
    private AppointType type;
    private AppointStatus status = AppointStatus.NOT_STARTED;
    private LocalDate date;
    private Employee specialist;

    public Appointment(AppointType type, LocalDate date, Employee especialist) {
        this.type = type;
        this.date = date;
        this.specialist =  especialist;
        appointments.add(this);
    }

    public AppointStatus getStatus() {
        return status;
    }

    public void setStatus(AppointStatus status) {
        this.status = status;
    }

    public static List<Appointment> getAppointments() {
        return appointments;
    }

    public Employee getSpecialist() {
        return this.specialist;
    }

    public String getDate() {
        return this.date.toString();
    }

    public String getType() {
        return this.type.toString();
    }

}
