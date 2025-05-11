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

//Although abstract classes cannot be used to instantiate objects,
// they can be used to create object references,
// because Java’s approach to run-time polymorphism is implemented through the use of super-class references.
// Thus, it must be possible to create a reference to an abstract class
// so that it can be used to point to a subclass object.