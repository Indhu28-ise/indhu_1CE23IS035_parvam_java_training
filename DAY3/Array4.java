import java.util.ArrayList;

public class Array4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(30);
        numbers.add(18);

        int max = numbers.get(0);
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Largest number is:");
        System.out.println(max);
    
    }
}
