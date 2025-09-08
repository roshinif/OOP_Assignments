import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        // Create instances
        Student student1 = new Student(1, "Alice", 20);
        Course course1 = new Course("CS101", "Introduction to Programming", "Dr. Smith");
        Enrollment enrollment1 = new Enrollment(student1, course1, "2025-09-08");

        String filename = "enrollments.ser";

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(enrollment1);
            System.out.println("Enrollment serialized to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Enrollment loadedEnrollment = (Enrollment) in.readObject();
            System.out.println("Deserialized Enrollment: ");
            System.out.println(loadedEnrollment);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
