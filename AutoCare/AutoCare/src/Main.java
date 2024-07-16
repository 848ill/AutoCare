package AutoCare.AutoCare.src;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private static List<Maintenance> maintenances = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();
    private static List<Reminder> reminders = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("AutoCare Menu:");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Add Maintenance Task");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Reminders");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addVehicle(scanner);
                    break;
                case 2:
                    addMaintenance(scanner);
                    break;
                case 3:
                    scheduleAppointment(scanner);
                    break;
                case 4:
                    viewReminders();
                    break;
                case 5:
                    generateReport(scanner);
                    break;
                case 6:
                    System.out.println("Exiting AutoCare...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addVehicle(Scanner scanner) {
        System.out.print("Enter vehicle make: ");
        String make = scanner.next();
        System.out.print("Enter vehicle model: ");
        String model = scanner.next();
        System.out.print("Enter vehicle year: ");
        int year = scanner.nextInt();
        System.out.print("Enter vehicle mileage: ");
        int mileage = scanner.nextInt();

        Vehicle vehicle = new Vehicle(make, model, year, mileage);
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    private static void addMaintenance(Scanner scanner) {
        System.out.print("Enter maintenance task: ");
        String task = scanner.next();
        System.out.print("Enter maintenance date (yyyy-mm-dd): ");
        String dateStr = scanner.next();
        Date date = Date.valueOf(dateStr);
        System.out.print("Enter mileage: ");
        int mileage = scanner.nextInt();

        Maintenance maintenance = new Maintenance(task, date, mileage);
        maintenances.add(maintenance);
        System.out.println("Maintenance task added successfully!");
    }

    private static void scheduleAppointment(Scanner scanner) {
        System.out.print("Enter appointment date (yyyy-mm-dd): ");
        String dateStr = scanner.next();
        Date date = Date.valueOf(dateStr);
        System.out.print("Enter appointment task: ");
        String task = scanner.next();

        Appointment appointment = new Appointment(date, task);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully!");
    }

    private static void viewReminders() {
        System.out.println("Reminders:");
        for (Reminder reminder : reminders) {
            System.out.println(reminder.getDate() + " - " + reminder.getTask());
        }
    }

    private static void generateReport(Scanner scanner) {
        System.out.print("Enter vehicle ID: ");
        int vehicleId = scanner.nextInt();
        Vehicle vehicle = getVehicle(vehicleId);
        if (vehicle!= null) {
            Report report = new Report();
            report.generateReport(vehicle);
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    private static Vehicle getVehicle(int vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == vehicleId) {
                return vehicle;
            }
        }
        return null;
    }
}