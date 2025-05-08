package ControlFlow.ConditionalStatement.SwitchCase;

public class Example1 {

    public static void main(String[] args) {
        int i = 4;

       switch (i + 1) // we can use like switch ( i + 1 ) that means we can do operation with variable;
       {
           case 1:
               System.out.println("I am one");
               break;

           case 2:
               System.out.println("I am two");
               break;

           case 3:
               System.out.println("I am three");
               break;

           case 3 + 1:
               System.out.println(" I am four");
               break;

// Error: java: constant expression required  so in the case we can use only value operation not variable operation
//           case i + 1:
//               System.out.println("I am five but compiler show error");
//               break;

           default:
               System.out.println("I am default");


       }
    }
}
