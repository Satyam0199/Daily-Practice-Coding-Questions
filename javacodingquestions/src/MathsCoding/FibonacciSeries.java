package MathsCoding;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 15;
        int first = 0;
        int second = 1;
        int next = 0;
        while(first < n)
        {
            next = first + second;
            System.out.println(next);
            first = second;
            second  =  next;
        }
    }
}
