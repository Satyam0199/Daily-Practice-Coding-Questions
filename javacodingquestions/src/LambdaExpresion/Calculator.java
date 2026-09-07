package LambdaExpresion;

@FunctionalInterface
interface AddTwoValue {
    void add(int a, int b);
}

public class Calculator {

    public static void main(String[] args) {

        AddTwoValue add = (int a, int b) -> {
            System.out.println(a + b);
        };

        add.add(10, 20);
    }
}