package TypeCasting;

public class UpCasting {
    public static void main(String[] args) {

        // Creating a Parent1 class object
        // but referencing it to a Child class

        parent p = new child();  // Upcasting
                                    //Parent1 p = new Child();

        p.display();// can relate this with dynamic polymorphism or function overriding.

    }
}

class parent
{
    void display()
    {
        System.out.println("I am from parent");
    }

}
class child extends parent
{
    @Override

    void display()
    {
        System.out.println("I am from child");
    }
}
