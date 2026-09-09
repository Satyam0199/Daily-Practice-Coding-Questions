package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        rotateArray(arr,2);

    }

    public static void rotateArray(int arr[], int k)
    {

        if(arr.length == 0)
        {
            return;
        }

        k %= arr.length;
        int i = 0;
        int j = k-1;
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        int left = k;
        int right = arr.length-1;
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        int l = 0;
        int r = arr.length-1;
        while(l < r)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for(int ans : arr)
        {
            System.out.print(ans+"  ");
        }


    }
}
