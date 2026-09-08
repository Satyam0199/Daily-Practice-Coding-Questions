package Arrays;

public class Reverse {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};

//        int n = arr.length;
//        for (int i = arr.length-1; i>=0; i--)
//        {
//            System.out.print(arr[i]+ "  ");
//        }

        int i = 0, j =arr.length-1;

        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int err : arr) System.out.print(err +"  ");
    }
}
