package constructor;

public class Student {

    private String studentId;
    private String name;
    private String major;
    private double gpa;

    public Student(String studentId, String name) {
        this(studentId, name, "Undeclare");
    }

    public Student(String studentId, String name, String major) {
        this(studentId, name, major, 0);
    }

    public Student(String studentId, String name, String major, double gpa) {
        if (studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("StudentId cannot be null");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void updateGpa(double newGpa) {
        if (newGpa < 0 || newGpa > 4) {
            System.out.println("gpa must between 0 to 4.00");
            return;
        }

        this.gpa = newGpa;
    }

    public void printInfo(){
        System.out.println("StudentId: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Gpa: " + gpa);
    }
}
