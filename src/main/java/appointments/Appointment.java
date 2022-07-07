package appointments;

enum AppointStatus {
    STARTED, FINISHED, CANCELED, ABSENT
}

enum AppointType {
    MEDICAL, SURGERY, AESTHETIC
}

public class Appointment {
    AppointType type;
    AppointStatus status;
    String date;

    public Appointment(AppointType type,AppointStatus status, String date) {
        this.type = type;
        this.status = status;
        this.date = date;
    }
}
