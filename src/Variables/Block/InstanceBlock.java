package Variables.Block;

public class InstanceBlock {

    InstanceBlock()
    {
        System.out.println("I am default constructor");
    }

    InstanceBlock(int a)
    {
        System.out.println("I am 2nd constructor overload");
    }
    {
        System.out.println("I am Instance block");
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock(10);


    }


}

