package ControlFlow.JumpStatement;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++)
        {
            if(i == 5)
            {
                System.out.println();
                continue; //skip the current iteration
            }
            System.out.print(i + " ");

        }
    }
}
