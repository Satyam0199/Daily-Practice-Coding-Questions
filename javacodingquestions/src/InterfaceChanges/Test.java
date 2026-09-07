package InterfaceChanges;

public class Test implements A, B{
    @Override
    public void show() {
//        System.out.println("Test");
//        A.super.show(); if you want to similarly call A so you can write this
//        B.super.show(); // if you want to similarly call A so you can write this

//        you can also call both
        A.super.show();
        B.super.show();
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.show();
    }

}
