package inheritance;

public class Employee {

    private String employeeId;
    private String name;


    public Employee(String employeeId, String name) {

        if (employeeId == null || employeeId.isBlank()) {
            throw new IllegalArgumentException("Employee Id cannot be blank");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void printBasicInfo() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + name);
    }
}
