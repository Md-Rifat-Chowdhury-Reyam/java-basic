package Operator.Unary;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;

        System.out.println((a++));
        System.out.println(++a);

        int b = 10;
        System.out.println(b--);
        System.out.println(--b);

        System.out.println(" ");

        int c = 10;

        System.out.println((c++));
        System.out.println(++c);

        System.out.println(c--);
        System.out.println(--c);


        System.out.println(" ");

        int d = 10;
        System.out.println(d++);
        int d1 = 10;
        System.out.println(++d1);
    }
}
