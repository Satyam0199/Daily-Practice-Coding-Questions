package MathsCoding;

public class CheckPalindrom {
    public static void main(String[] args) {

        int num = 123;
        int rev = 0;
        int original = num;
        boolean palindrom = false;
        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println(rev);
        if(original == rev)
        {
           palindrom = true ;
        }
        else
        {
            palindrom = false;
        }

        System.out.println(palindrom);
    }
}
