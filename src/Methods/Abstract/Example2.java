package Methods.Abstract;

public class Example2 {
    public static void main(String[] args) {

        B b = new B();
        b.method1();
        b.method2();
    }
}

abstract class A
{
   abstract void method1(); // abstract method dont have any body

    void method2()      // concrete methods are still
                         // allowed in abstract classes
    {
        System.out.println("I am from abstract class");
    }


}

class B extends A
{
    @Override
    void method1() {
        System.out.println("class B implemented from abstract class A's abstract method");
    }
}
