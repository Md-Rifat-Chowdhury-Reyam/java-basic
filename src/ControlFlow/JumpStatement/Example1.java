package ControlFlow.JumpStatement;

public class Example1 {
    public static void main(String[] args) {

        for(int i = 0; i <= 10 ; i++)
        {
            if(i == 4)
            {

                break;
            }
            System.out.print( i + " ");
        }

        System.out.println();

        for(int i = 0 ; i <= 10 ; i++)
        {
            if(i == 5)
            {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
