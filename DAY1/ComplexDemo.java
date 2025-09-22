class Complex {
    private double real;
    private double imag;
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}
public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);  
        Complex c2 = new Complex(2, -3); 
        System.out.print("First Complex Number: ");
        c1.display();
        System.out.print("Second Complex Number: ");
        c2.display();
    }
}



