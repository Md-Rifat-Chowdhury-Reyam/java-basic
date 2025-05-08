package ControlFlow.ConditionalStatement.SwitchCase;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Chose your day in number : ");
        int countDay = sc.nextInt();
        
        String day;

        switch (countDay)
        {
            case 1:
                day = "Saturday";
                //break;

            case 2:
                day = "Sunday";
                //break;

            case 3:
                day = "Monday";
                //break;

            default:
                day = "Friday";
              //  break;   //if there no break key then code execute the final or default


        }
        System.out.println(day);


    }
}
