package Arrays;

public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[] = {10,02,032,32,34,45,56,76,34,78};

        int n = 34;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == n )
            {
                System.out.println(n);
                break;
            }
        }
    }
}
