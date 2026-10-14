package inheritance;

public class EmployeeMain {


    public static void main(String[] args) {

        FullTimeEmployee pattama = new FullTimeEmployee("F001", "Pattama", 35_000);
        PartTimeEmployee ratthida = new PartTimeEmployee("P001", "Ratthida", 300, 80);


        pattama.printBasicInfo();
        System.out.println("Monthly Salary: " + pattama.getMonthlySalary());

        System.out.println();

        ratthida.printBasicInfo();
        System.out.println("Hourly Rate: " + ratthida.getHourlyRate());
        System.out.println("Hours Worked: " + ratthida.getHoursWorked());
        System.out.println("Total Salary: " + ratthida.calculateSalary());
    }
}
