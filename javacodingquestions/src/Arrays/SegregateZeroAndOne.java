package Arrays;

public class SegregateZeroAndOne {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,0};
        segregateZero(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void segregateZero(int arr[]) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            while (i < j && arr[i] == 0) {
                i++;
            }

            while (i < j && arr[j] == 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
    }
}
