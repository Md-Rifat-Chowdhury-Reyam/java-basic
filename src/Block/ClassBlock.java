package Block;

//parent class
public class ClassBlock {

    ClassBlock()
    {
        System.out.println("default parent constructor");
    }
    //instance initialization block
    {
        System.out.println("IIB 2 ");
    }
}

class Bc extends  ClassBlock
{
    Bc()
    {
        super();
        System.out.println("child class constructor");
    }
    {
        System.out.println("IIB 1");
    }

    public static void main(String[] args) {
        Bc b = new Bc();


    }

}
