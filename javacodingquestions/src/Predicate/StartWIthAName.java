package Predicate;

import java.util.function.Predicate;

public class StartWIthAName {
    public static void main(String[] args) {
        Predicate<String> p = n -> n.startsWith("A");
        System.out.println(p.test("Satyam"));
        System.out.println(p.test("Anshuman"));
        System.out.println(p.test("Aditya"));
    }
}
