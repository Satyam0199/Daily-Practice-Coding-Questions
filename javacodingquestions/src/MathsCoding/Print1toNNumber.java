package MathsCoding;

public class Print1toNNumber {
    public static void main(String[] args) {

        int number = 10;

        // ================================Print Even Number
        for (int i = 1; i<= number;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        // ================================Print Odd Number
        for (int i = 1; i<= number;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }

}
