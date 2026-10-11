package staticvsinstance;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("E001", "Aom", 25000);
        Employee employee2 = new Employee("E002", "Mild", 30000);
        Employee employee3 = new Employee("E003", "Beam", 18000);

        employee1.increaseSalary(10);
        employee2.increaseSalary(-5); // ต้องไม่เพิ่ม

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();



        System.out.println("Aom bonus: " + employee1.calculateBonus());
        System.out.println("Total employees: " + Employee.getTotalEmployees());
        System.out.println("Minimum salary: " + Employee.MIN_SALARY);
    }
}
