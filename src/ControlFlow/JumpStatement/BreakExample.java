package ControlFlow.JumpStatement;

public class BreakExample {
    public static void main(String[] args) {

        //break loop
        for (int i = 1; i <= 10; i++)
        {
            if(i == 6)
            {
                System.out.print(i + " ");
                break;  //will print 1 to 5 then 6 so output : 1 2 3 4 5 6
            }
            System.out.print(i + " ");
        }

        System.out.println();

        // break keyword as a Goto statement
        for (int j = 1; j <= 3; j++)
        {
            one :
            {
                two:
                {
                    three :
                    {
                        System.out.println(" j = " + j);
                        if (j == 1)
                        {
                            break one ;
                        }
                        if (j == 2)
                        {
                            break two;
                        }
                        if (j == 3)
                        {
                            break three;
                        }
                    }
                        System.out.println("Level 3 ");
                }
                    System.out.println("Level 2 ");

            }
                System.out.println("Level 1 ");
        }

        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            one :
            { // label one
                two :
                { // label two
                    three :
                    { // label three
                        System.out.println("i=" + i);
                        if (i == 0) {
                            break one; // break to label one
                        }
                        if (i == 1)
                            {
                                break two; // break to label two
                            }
                        if (i == 2)
                        {
                            break three; // break to label three
                        }
                    }
                    System.out.println("after label three");
                }
                System.out.println("after label two");
            }
            System.out.println("after label one");
        }
    }
}
