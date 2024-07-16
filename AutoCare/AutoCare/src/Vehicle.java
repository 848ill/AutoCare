package AutoCare.AutoCare.src;

public class Vehicle {
    private int id;
    private String make;
    private String model;
    private int year;
    private int mileage;

    public Vehicle(String make, String model, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.id = id;
    
    }

    public int getId(){
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

}