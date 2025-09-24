import java.util.ArrayList;
public class ArrayListExample {
public static void main(String[] args) {
ArrayList<String> fruits = new ArrayList<>(1,2,3,4,5);
fruits.add("goa");
fruits.add("bangalore");
fruits.add("delhi");
for (String fruit : fruits) {
System.out.println(fruit);
}
}
}
