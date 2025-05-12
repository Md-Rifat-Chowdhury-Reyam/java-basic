package Methods.Varargs;

public class Example1 {

    // Method that accepts variable number
    // of String arguments using varargs
    static void names(String... n)  // (data type ... variable) --> varargs
    {
        // Iterate through the array
        // and print each name
        for(String i : n)
        {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        names("Rifat" , "Reyam");
    }
}
