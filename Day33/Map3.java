import java.util.HashMap;
import java.util.Map;
public class Map3 {
    public static void main(String[] args) {
        String text = "programming";
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println("Character: " + entry.getKey());
            System.out.println("Count: " + entry.getValue());
        }
    }
}
