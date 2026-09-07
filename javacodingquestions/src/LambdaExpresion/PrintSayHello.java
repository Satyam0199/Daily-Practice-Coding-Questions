package LambdaExpresion;

@FunctionalInterface
interface Greeting {
    void greet(String name);
}

public class PrintSayHello {

    public static void main(String[] args) {

        Greeting greeting = (String greet) -> {
            System.out.println(greet);
        };

        greeting.greet("Hello Satyam");
    }
}
