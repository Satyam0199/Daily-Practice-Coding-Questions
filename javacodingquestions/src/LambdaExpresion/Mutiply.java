package LambdaExpresion;

@FunctionalInterface
interface subtract
{
    void multiply(int a , int b);

}

public class Mutiply {
    public static void main(String[] args) {

        subtract multiply = (int a, int b) ->
        {
            System.out.println(a*b);
        };

        multiply.multiply(10,8);

    }
}
