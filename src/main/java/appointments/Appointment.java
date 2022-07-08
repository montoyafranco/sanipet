package appointments;
import java.util.Calendar;

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
