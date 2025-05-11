package Methods.Final;

public class FinalMethodInAbstractClass {
    public static void main(String[] args) {

        A a = new A();
        a.m1();
        a.cicleMethod(5);
    }
}

abstract class Final
{
    final void cicleMethod(int r)
    {
        double circlePerimeter =  2 * Math.PI * r;
        System.out.println(circlePerimeter);
    }

    abstract void m1();
}


class A extends Final
{
    @Override
    void m1() {
        System.out.println("I am from abstract class ");
    }
}
