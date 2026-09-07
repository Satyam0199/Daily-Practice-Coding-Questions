package InterfaceChanges;

public interface A {
    default void show()
    {
        System.out.println("This is A interface method");
    }
}
