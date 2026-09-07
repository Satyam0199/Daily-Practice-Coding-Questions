package ArrayList;

import java.sql.Array;
import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(32);
        list.add(45);
        list.add(56);
        list.add(32);

        int max = list.get(0);
        for(int i = 0; i<list.size();i++)
        {
            if(list.get(i)> max)
            {
                max = list.get(i);
            }
        }

        System.out.println(max);
    }
}
