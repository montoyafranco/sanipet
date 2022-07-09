package appointments;

public class Appointment {
    AppointType type;
    private AppointStatus status = AppointStatus.NOT_STARTED;
    String date;

    public Appointment(AppointType type, String date) {
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
