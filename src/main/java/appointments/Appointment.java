package appointments;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import employee.Employee;
import Sanipet.Patient;
import Medicines.Medicine;

public class Appointment {
    private static final List<Appointment> appointments = new ArrayList<>();
    private final AppointType type;
    private AppointStatus status = AppointStatus.NOT_STARTED;
    private final LocalDate date;
    private final Employee specialist;
    private final Patient pet;
    private Medicine medicine;

    public Appointment(Patient pet, AppointType type, LocalDate date, Employee especialist) {
        this.type = type;
        this.date = date;
        this.pet = pet;
        this.specialist = especialist;
        appointments.add(this);
    }

    public AppointStatus getStatus() {
        return status;
    }

    public void setStatus(AppointStatus status) {
        if(status == AppointStatus.FINISHED) {
            this.specialist.finishAppointment(this);
        }
        this.status = status;
    }

    public void setMedicine(Medicine med) {
        med.reduceStock();
        this.pet.getMedicinesToPay().add(med);
        this.medicine = med;
    }

    public static List<Appointment> getAppointments() {
        return appointments;
    }

    public static List<Appointment> filterAppointmentsByDate(LocalDate date) {
        List<Appointment> filteredAppointments = new ArrayList<>();
        for(Appointment apt : appointments) {
            if(date.toString().equals(apt.getDate())) {
                filteredAppointments.add(apt);
            }
        }
        return filteredAppointments;
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

    public Patient getPet() {
        return this.pet;
    }

}
