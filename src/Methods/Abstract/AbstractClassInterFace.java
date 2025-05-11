package Methods.Abstract;

public class AbstractClassInterFace {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.areaOfCircle(4);

        C c1 = new C();
        c1.sum(7,6);
    }
}

//abstract class and abstract method

abstract class Abstract
{
    abstract void areaOfCircle(int r );
}
class Circle extends Abstract
{

    @Override
    void areaOfCircle(int r) {
        System.out.println("circle area : " + (2 * Math.PI * r));
    }
}


//interface and abstract method

interface Interfaceable
{
    abstract void sum(int i , int j);

}

class C implements Interfaceable
{
    @Override
    public void sum(int i, int j) {
        System.out.println("sum : " + (i + j));
    }
}

