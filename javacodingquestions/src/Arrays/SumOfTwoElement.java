package Arrays;

public class SumOfTwoElement {
    public static void main(String[] args) {
        int arr[] = {2,45,23,65,23,-9};
        int target = 46;

        int ans[] = new int[2];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] + arr[i+1] == target)
            {
                ans[0]= arr[i];
                ans[1]= arr[i+1];
            }
        }

        for (int i = 0; i <ans.length-1;i++)
        {
            System.out.print (ans[i] +" " );
        }
    }
}
