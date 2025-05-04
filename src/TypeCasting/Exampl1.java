package TypeCasting;

public class Exampl1 {
    public static void main(String[] args) {

        Parent p = new Child(); //a parent class data member is accessed
                                // when a reference of parent type refers to a child object.

        Parent pAnothor = p;

        if(pAnothor instanceof Child)
        {
            Child c = new Child();
            c.display();
            System.out.println();

            System.out.println((Child)pAnothor);
            System.out.println(((Child)pAnothor).val);
        }
        else
        {
            System.out.println(" ");
        }
    }
}

class Parent
{
//    int val = 2000;
    void display()
    {
        System.out.println("I am parent");
    }


}
class Child extends Parent
{

    int val = 10;

    void display()
    {
        System.out.println("I am child");
        Integer wV = this.val;
        System.out.println("memory address of val " + val +" : " +  System.identityHashCode(wV));

    }
}
