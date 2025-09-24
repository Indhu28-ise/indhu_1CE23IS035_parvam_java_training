import java.util.HashMap;

public class HashMap{
    public static void main(String[] args) {
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 100);
        fruits.put("Banana", 40);
        fruits.put("Mango", 80);

        System.out.println("Fruits and Prices:");
        for (String key : fruits.keySet()) {
            System.out.println(key + " : " + fruits.get(key));
        }
    }
}

