package staticvsinstance;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("S001", "Harry Potter");

        Student student2 = new Student("S002", "Gilderoy Lockhart", "Computer Science");

        Student student3 = new Student( "S003","McGonagall","Information Technology",3.45);


        student1.printInfo();
        System.out.println();
        student2.printInfo();
        System.out.println();
        student3.printInfo();
        System.out.println();

        student1.updateGpa(3.20);
        student2.updateGpa(4.60);

        student1.printInfo();
        System.out.println();
        student2.printInfo();
        System.out.println();

        System.out.println("Total students: " + Student.getTotalStudents());
        System.out.println("Maximum GPA: " + Student.MAX_GPA);

    }
}
