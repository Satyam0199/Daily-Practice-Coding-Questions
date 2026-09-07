package Arrays;

public class GivenArrayPrintNegitiveNumber {

    public static void main(String[] args) {
        int arr[]  = {20,-23,34,45,-9,23,-34};

        for(int i = 0; i <arr.length; i++)
        {


            if(arr[i] < 0)
            {
                System.out.print(arr[i]+ "  ");
            }
        }

    }
}
