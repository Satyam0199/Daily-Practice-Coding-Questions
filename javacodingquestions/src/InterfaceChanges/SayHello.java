package InterfaceChanges;

public class SayHello implements TestClass {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

     SayHello s = new SayHello();
     s.sayHello();
     s.greetMsg();

    }
}
