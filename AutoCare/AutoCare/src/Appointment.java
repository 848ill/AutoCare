package AutoCare.AutoCare.src;

import java.sql.Date;

public class Appointment {
    private Date date;
    private String task;

    public Appointment(Date date, String task) {
        this.date = date;
        this.task = task;
    }

    public Date getDate() {
        return date;
    }

    public String getTask() {
        return task;
    }
}
