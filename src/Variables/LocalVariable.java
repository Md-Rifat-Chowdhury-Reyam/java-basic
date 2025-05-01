package Variables;

public class LocalVariable {


    public static void main(String[] args) throws Exception {

        int x = 10; // local variable

        String message = "Rifat how are you ?"; //local variable
        System.out.println(message);

        if(x == 10)
        {
            String msg = "Result true"; // local variable;
            System.out.println(msg);
        }
        for (int i = 0; i < 2; i++)
        {
            System.out.println("Iteration " + i);
        }


    }
}
