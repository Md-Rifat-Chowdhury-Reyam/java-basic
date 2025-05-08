package ControlFlow.ConditionalStatement.SwitchCase;


import java.util.Scanner;

public class NestedSwitchCase {

    public static void main(String[] args) {

        System.out.println("University curriculum");

        String Department;
        int semester;

        Scanner sc = new Scanner(System.in);

        System.out.println("Chose your department : " );
        Department = sc.nextLine();

        System.out.println("chose your semester : ");
        semester = sc.nextInt();


        switch (Department)
        {
            case "CSE":

                switch (semester) //nested switch case
                {
                    case 1:
                        System.out.println("Your department :" + Department + " and semester " + semester);
                        break;

                    case 2:
                        System.out.println("Your department :" + Department + " and semester " + semester);
                        break;

                    default:
                        System.out.println("No info");
                        break;
                };
                break;

            case "BBA":

                switch (semester)
                {
                    case 1:
                        System.out.println("Your department :" + Department + " and semester " + semester);
                        break;

                    case 2:
                        System.out.println("Your department :" + Department + " and semester " + semester);
                        break;

                    default:
                        System.out.println("No info");
                        break;
                };
                break;

            default:
                System.out.println("No info");
                break;

        }
    }
}
