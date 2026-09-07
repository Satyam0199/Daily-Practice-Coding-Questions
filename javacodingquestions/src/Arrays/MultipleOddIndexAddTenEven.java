package Arrays;

public class MultipleOddIndexAddTenEven {
    public static void main(String[] args) {
        int arr[] = {10,15,20,25,30,35,40,45,50};
        for(int i = 0 ; i < arr.length; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(arr[i] * 2+ " ");
            }
            else {
                System.out.println(arr[i] + 10+" ");
            }
        }

    }
}
