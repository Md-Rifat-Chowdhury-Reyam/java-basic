package Operator.InstanceOf;

public class Parent
{

}

class Child extends Parent
{


}
class execute
{
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("I am from child " + (c instanceof Child));
        System.out.println("I am from parent " + (c instanceof Parent) );

        System.out.println();
        Parent p1 = new Parent();
        //Parent object is not an instance of Child
        System.out.println("I am parent object from child " + (p1 instanceof  Child));


        System.out.println();
        //Parent reference referring to a Child is an instance of a Child
        Parent pp = new Child();
        System.out.println("I am Parent object refer to child " + (pp instanceof Child));


        System.out.println();
        // instanceof returns true for all ancestors
        // Note : Object is ancestor of all classes in Java
        System.out.println("I am from object " + (c instanceof Object));


        System.out.println(" ");
        Parent p = null; // instanceof returning false for null
        System.out.println("I am from parent " + (p instanceof Parent));
    }
}