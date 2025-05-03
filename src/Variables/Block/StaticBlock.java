package Variables.Block;

public class StaticBlock {

    StaticBlock()
    {
        System.out.println("I am default");
    }

    StaticBlock(int a)
    {
        System.out.println("I am parameter constructor");
    }
    {
        System.out.println("I am instance block");
    }
    static
    {
        System.out.println("I am static block");
    }

    public static void main(String[] args) {

        new StaticBlock();
        new StaticBlock(9);
    }
}
