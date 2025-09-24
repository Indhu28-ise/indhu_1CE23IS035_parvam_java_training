import java.util.HashMap;
import java.util.Map;

public class Map1{
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 100);
        fruits.put("Banana", 40);
        fruits.put("Mango", 80);

        System.out.println("Fruits and Prices:");
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println("Fruit: " + entry.getKey());
            System.out.println("Price: " + entry.getValue());
        }
    }
}
