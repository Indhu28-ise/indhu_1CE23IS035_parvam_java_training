public class ComplexaddDemo {
        public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, -3);
        System.out.print("First Complex Number: ");
        c1.display();
        System.out.print("Second Complex Number: ");
        c2.display();
        Complex sum = c1.add(c2);
        System.out.print("Addition Result: ");
        sum.display();
        Complex diff = c1.subtract(c2);
        System.out.print("Subtraction Result: ");
        diff.display();
        Complex prod = c1.multiply(c2);
        System.out.print("Multiplication Result: ");
        prod.display();
    }
}