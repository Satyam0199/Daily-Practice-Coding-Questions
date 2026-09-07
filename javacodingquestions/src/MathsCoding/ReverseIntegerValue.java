package MathsCoding;

public class ReverseIntegerValue {
    public static void main(String[] args) {

        int val = 12345;
        int reverse = 0;
        while(val != 0)
        {
            int digit = val % 10;
            reverse = reverse * 10 + digit;
            val = val/10;
        }
        System.out.println(reverse);
    }
}
