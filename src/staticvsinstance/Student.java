package staticvsinstance;

public class Student {

    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 4.0;

    private static int totalStudents = 0;

    private String studentId;
    private String name;
    private String major;
    private double gpa;

    public Student(String studentId, String name) {
        this(studentId, name, "Undeclared");
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

        totalStudents++;
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
        if (newGpa < MIN_GPA || newGpa > MAX_GPA) {
            System.out.println("gpa must between " + MIN_GPA + " and " + MAX_GPA);
            return;
        }

        this.gpa = newGpa;
    }

    // static method
    public static int getTotalStudents() {
        return totalStudents;
    }

    public void printInfo() {
        System.out.println("StudentId: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Gpa: " + gpa);
    }
}
