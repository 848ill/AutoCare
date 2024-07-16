package AutoCare.AutoCare.src;

public class Report {
    public void generateReport(Vehicle vehicle) {
        System.out.println("Vehicle Report:");
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Mileage: " + vehicle.getMileage());
        System.out.println("Maintenance History:");
        // iterate through maintenance tasks and print
    }
}
