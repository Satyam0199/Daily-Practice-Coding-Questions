package Arrays;

public class SumOfTwoElement {
    public static void main(String[] args) {

        int arr[] = {2, 45, 23, 65, 23, -9};
        int target = 46;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return;
                }
            }
        }
    }
}