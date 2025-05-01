package Variables;

public class staticVariable {
    public static int a = 8;

    public static void main(String[] args) {
        System.out.println("this is static variable value = " + a ); // direct call


        //call with call
        System.out.println("I am value of static variable : " + staticVariable.a );
    }
}
