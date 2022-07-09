package appointments;

import java.time.LocalDate;

public class Appointment {
    AppointType type;
    private AppointStatus status = AppointStatus.NOT_STARTED;
    LocalDate date;

    public Appointment(AppointType type, LocalDate date) {
        this.type = type;
        this.date = date;
    }

    public AppointStatus getStatus() {
        return status;
    }

    public void setStatus(AppointStatus status) {
        this.status = status;
    }
}
