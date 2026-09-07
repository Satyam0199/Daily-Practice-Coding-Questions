package Predicate;

import java.util.function.Predicate;

public class GreaterNumber {
    public static void main(String[] args) {
        Predicate<Integer> p = n -> n > 50;
        System.out.println(p.test(30));
        System.out.println(p.test(70));
    }

}
