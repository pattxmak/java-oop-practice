package inheritance;

public class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name);

        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negatinve");
        }

        if (hoursWorked < 0) {
            throw new IllegalArgumentException("hours worked cannot be negatinve");
        }

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
