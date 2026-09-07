package Arrays;

import java.util.Scanner;

public class PrintProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

        int product = 1;
        for(int i = 0; i < 5; i++)
        {
            product = product * arr[i];
        }

        System.out.println(product);
    }
}
