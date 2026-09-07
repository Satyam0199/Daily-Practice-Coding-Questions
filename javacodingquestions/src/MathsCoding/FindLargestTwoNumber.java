package MathsCoding;

public class FindLargestTwoNumber {
    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,7,8,9};
        int largest = arr[0];
        int secondLargest = arr[1];
        for(int i = 2 ; i<arr.length; i++)
        {
            if(arr[i]> largest) // 4>2
            {
                largest = arr[i]; // 4
            } else if (arr[i] > secondLargest || largest > secondLargest) {

                secondLargest = arr[i];
            } else{
                secondLargest = arr[i];
            }
        }

        System.out.println(largest+" "+secondLargest);

    }
}
