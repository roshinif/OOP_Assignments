import java.io.Serializable;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
    public String getEnrollmentDate() { return enrollmentDate; }

    @Override
    public String toString() {
        return "Enrollment{" +
                "student=" + student +
                ", course=" + course +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                '}';
    }
}
