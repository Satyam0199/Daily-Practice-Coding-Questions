package Arrays;

import java.util.Scanner;

public class FindMaximumOfArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i = 0; i < 5; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
