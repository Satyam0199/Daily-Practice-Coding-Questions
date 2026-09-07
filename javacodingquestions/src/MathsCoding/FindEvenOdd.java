package MathsCoding;

public class FindEvenOdd {
    public static void main(String[] args) {

        int num = 21;
        boolean number;
        if (num / 10 == 0) {
            number = true;
        } else {
            number = false;
        }

        if (number)
        {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
