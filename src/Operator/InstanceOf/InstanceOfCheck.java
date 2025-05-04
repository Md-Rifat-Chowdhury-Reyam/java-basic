package Operator.InstanceOf;

public interface InstanceOfCheck {

}

class person implements InstanceOfCheck
{

}
class Man
{

}
class InstanceOF
{
    public static void main(String[] args) {

        Man man = new Man();
        System.out.println("man instance of Man class " + (man instanceof Man));

        person p = new person();
        System.out.println("p is instance of person class " + (p instanceof person));



    }

}


