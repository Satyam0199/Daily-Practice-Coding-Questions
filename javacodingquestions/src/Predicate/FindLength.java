package Predicate;

import java.util.function.Predicate;

public class FindLength {

    public static void main(String[] args) {
        String name = "javadeveloper";
        Predicate<String> p =n -> n.length() > 5;
        System.out.println(p.test(name));
    }

}
