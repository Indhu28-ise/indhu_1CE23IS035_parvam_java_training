import java.util.ArrayList;

public class Array3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("After removing even numbers");
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
