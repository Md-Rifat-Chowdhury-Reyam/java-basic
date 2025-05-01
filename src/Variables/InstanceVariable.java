package Variables;

public class InstanceVariable {

    public int  a ; // instance variable

    InstanceVariable()
    {
        this.a = 100; // initialize instance variable in constructor;

    }

    public static void main(String[] args) {
        InstanceVariable iv  = new InstanceVariable();

        System.out.println(iv.a);
    }



}
