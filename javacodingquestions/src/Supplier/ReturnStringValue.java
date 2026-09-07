package Supplier;

import java.util.function.Supplier;

public class ReturnStringValue {
    public static void main(String[] args) {
        Supplier<String> s = () ->  "Satyam Raikwar";

        System.out.println(s.get());
    }
}
