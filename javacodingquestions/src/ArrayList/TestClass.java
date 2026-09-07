package ArrayList;

import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(null);
        list.add(50);

        System.out.println(list);
        System.out.println(list.get(2));
        list.set(3,20);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);


    }
}
