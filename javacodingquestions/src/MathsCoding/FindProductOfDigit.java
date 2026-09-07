package MathsCoding;

public class FindProductOfDigit {
    public static void main(String[] args) {

        int num = 1234;
        int product = 1;
        while(num != 0)
        {
            int digit = num % 10;
            product = product * digit;
            num = num /10;
        }

        System.out.println(product);
    }
}
