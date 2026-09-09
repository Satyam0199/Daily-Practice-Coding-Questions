package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        System.out.println( missingArray(arr));

    }

    public static int missingArray(int arr[])
    {
        int n = arr.length + 1;

        int mid = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return mid - sum;
    }

}
