package InterfaceChanges;

public interface TestClass {
    public void sayHello();
    public default void greetMsg()
    {
        System.out.println("Good Evening From Default methods");
    }
}


