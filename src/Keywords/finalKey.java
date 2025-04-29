package Keywords;

public class finalKey {

    public static void main(String[] args) {
          //Indicates that a variable holds a constant value or that a method will not be overridden
         // final key for fixed value for the variable;
        //if we try to assign to i more value compile will show compile error;

        final int i = 10;

        if(i == 10)
        {
            System.out.println("final key word used");
        }
        else
        {
            System.out.println("Unsuccessful");
        }


    }
}
