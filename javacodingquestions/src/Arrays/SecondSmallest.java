package Arrays;

public class SecondSmallest {
    public static void main(String[] args) {

        int arr[] = {10, 5, 20, 8 };

        int smallest = arr[0];
        int secondSmallest =  arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }


        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < secondSmallest && arr[i] > smallest )
            {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);


    }

}
