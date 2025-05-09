package ControlFlow.JumpStatement;

public class ReturnStatement {

    static int sum (int a, int b)
    {
        int cal = a + b;
        return cal; //return •	It is used to exit from a method, with or without a value.
        /*
         * // Note: Any code after the 'return' statement will
         *         // not be executed. But "Final" is an exception in
         *         // the case of try-catch-final block.
         *         // System.out.println("end"); // error : unreachable
         *         // statement
         */

    }

    public static void main(String[] args) {


       int a1 = sum(10,40);
        System.out.println(a1);
    }
}
