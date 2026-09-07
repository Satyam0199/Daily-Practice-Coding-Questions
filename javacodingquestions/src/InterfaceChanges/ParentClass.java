package InterfaceChanges;

public class ParentClass implements A{

    public void show()
    {

        System.out.println("This is class method");
        A.super.show();
    }

    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        p.show();
    }

}
