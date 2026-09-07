package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FliterEvenNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,20,25,30,35,40,45,50);

        Predicate<Integer> p = n -> n % 2 ==0;

        for(int a: list )
        {
            if(p.test(a))
            {
                System.out.println(a);
            }
        }

    }
}
