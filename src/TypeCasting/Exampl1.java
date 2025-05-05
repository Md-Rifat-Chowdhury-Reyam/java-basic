package TypeCasting;

public class Exampl1 {
    public static void main(String[] args) {

        Parent1 p = new Child1(); //a parent class data member is accessed
                                // when a reference of parent type refers to a child object.

        Parent1 pAnothor = p;

        if(pAnothor instanceof Child1)
        {
            Child1 c = new Child1();
            c.display();
            System.out.println();

            System.out.println((Child1)pAnothor);

            System.out.println(((Child1)pAnothor).val);
        }
        else
        {
            System.out.println(" ");
        }
    }
}

class Parent1
{
//    int val = 2000;
    void display()
    {
        System.out.println("I am parent");
    }


}
class Child1 extends Parent1
{

    int val = 10;

    void display()
    {
        System.out.println("I am child");
        Integer wV = this.val;
        System.out.println("memory address of val " + val +" : " +  System.identityHashCode(wV));

    }
}
