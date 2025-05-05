package TypeCasting;

public class Example3 {
    public static void main(String[] args) {

        Parentt pa = new Childd(); //upcasting
        pa.name = "Rifat";
        pa.method();

   //down casting explicitly;
        Childd ch = (Childd)pa;
        ch.id = 1;
        ch.method();
    }
}

class Parentt
{
    String name;
    void method()
    {
        System.out.println("I am from parent " + name );
    }

}
class Childd extends Parentt
{
    int id;
    @Override
    void method()
    {
        System.out.println("I am from child " + id);
    }

}
