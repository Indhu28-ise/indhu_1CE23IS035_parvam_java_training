import java.util.ArrayList;

public class Array5 {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("1");
         numbers.add("2");
          numbers.add("3");
           numbers.add("4");
        for (int i = 0, j = numbers.size()
         - 1; i < j; i++, j--) {
            String temp =  numbers.get(i);
             numbers.set(i,  numbers.get(j));
             numbers.set(j, temp);
        }
               System.out.println("Reversed list:");
        for (String n :  numbers) {
            System.out.println(n);
        }
    }
}
