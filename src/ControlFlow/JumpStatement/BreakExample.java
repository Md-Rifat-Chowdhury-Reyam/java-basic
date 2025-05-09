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
    }
}
