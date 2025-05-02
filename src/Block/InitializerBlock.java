package Block;

public class InitializerBlock {

    int a ;
    InitializerBlock()
    {
        System.out.println("default constructor with " + a );
    }

    //initializer block
    {
        a = 100;
    }

    public static void main(String[] args) {
        InitializerBlock i = new InitializerBlock();

    }


}
