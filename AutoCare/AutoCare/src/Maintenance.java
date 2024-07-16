package AutoCare.AutoCare.src;

import java.sql.Date;

public class Maintenance {
    private String task;
    private Date date;
    private int mileage;

    public Maintenance(String task, Date date, int mileage) {
        this.task = task;
        this.date = date;
        this.mileage = mileage;
    }

    public String getTask() {
        return task;
    }

    public Date getDate() {
        return date;
    }

    public int getMileage() {
        return mileage;
    }
}
