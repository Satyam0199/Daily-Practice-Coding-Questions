package Predicate;

import java.util.function.Predicate;

public class CheckEvenODD {

    public static void main(String[] args) {

        Predicate<Integer> p = n -> n%2==0;
        System.out.println(p.test(7));

    }
}
