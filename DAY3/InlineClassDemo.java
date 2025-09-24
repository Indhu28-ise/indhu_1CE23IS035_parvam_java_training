interface Greeting {
    void sayHello();
}

public class InlineClassDemo {
    public static void main(String[] args) {
               Greeting englishGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("hello");
            }
        };

         englishGreeting.sayHello();
    }
}
