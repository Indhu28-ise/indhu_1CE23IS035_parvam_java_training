
import java.util.ArrayList;
class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Array6 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Alice"));
        users.add(new User(2, "Bob"));
        int searchId = 2;
        boolean found = false;
        for (User u : users) {
            if (u.id == searchId) {
                System.out.println("User found:");
                System.out.println("Id: " + u.id);
                System.out.println("Name: " + u.name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}
