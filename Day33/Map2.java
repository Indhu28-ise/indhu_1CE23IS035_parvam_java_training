import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println("Student with ID 101:");
        System.out.println(students.get(101));
    }
}
