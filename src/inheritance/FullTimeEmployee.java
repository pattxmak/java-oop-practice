package inheritance;

public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(String employeeId, String name, double monthlySalary) {
        super(employeeId, name);

        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Monthly salary cannot be negative");
        }

        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
