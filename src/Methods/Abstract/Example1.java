package Methods.Abstract;

public class Example1 {
    public static void main(String[] args) {

        Operation a = new Add();
        a.printInfo();
        Operation s = new sub();
        s.printInfo();

    }
}

abstract class Operation //abstraction class
{
    abstract void printInfo(); //abstraction method

}

class Add extends Operation
{
    void printInfo ()
    {

        int sumation = 1 + 2 ;
        System.out.println(sumation);
    }
}

class sub extends Operation
{
    void printInfo ()
    {

        int subtraction = 2 -1;
        System.out.println(subtraction);
    }
}



