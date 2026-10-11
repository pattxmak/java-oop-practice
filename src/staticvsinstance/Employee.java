package staticvsinstance;

public class Employee {

    private String employeeId;
    private String name;
    private double salary;

    private static int totalEmployees;
    public static final double MIN_SALARY = 15000.0;
    public static final double BONUS_RATE = 0.10;

    public Employee(String employeeId, String name, double salary) {

        if (employeeId == null || employeeId.isBlank()) {
            throw new IllegalArgumentException("Employee Id cannot be null");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        if (salary < MIN_SALARY) {
            throw new IllegalArgumentException("Salary cannot be less than the minimum salary.");
        }

        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;

        totalEmployees++;
    }

    public void increaseSalary(double percent) {
        if (percent <= 0) {
            System.out.println("Percent must be greater than 0.");
            return;
        }

        salary += salary * percent / 100;
    }

    public double calculateBonus() {
        return salary * BONUS_RATE;
    }

    public void printInfo(){
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

}
