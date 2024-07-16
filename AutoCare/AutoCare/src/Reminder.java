package AutoCare.AutoCare.src;

import java.sql.Date;

public class Reminder {
    private Date date;
    private String task;

    public Reminder(Date date, String task) {
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
