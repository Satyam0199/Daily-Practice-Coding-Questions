package Arrays;

public class FindSecondMax {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,42,34,24,89};
        int n = arr.length;

        int max = 0;
        int secondMax = 0;

        for(int i =0;i<n;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] < max && arr[i] > secondMax )
                secondMax = arr[i];
        }

        System.out.println(" Maximum " +max);
        System.out.println(" Second Maximum "+ secondMax);

    }
}
