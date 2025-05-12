package Methods.Varargs;

public class VarargswithIntegerArguments {

    static void names(String... a)
    {
        System.out.println("Number of String : " + a.length);
        for (String i : a)
        {
            System.out.println(i);
        }
        System.out.println();
    }

    static void numbers(int... n)
    {
        System.out.println("Number of integer argument : " + n.length);
        for(int i : n)
        {
            System.out.println(i);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        numbers(1,2,5);
        numbers(100);
        numbers();

        names("Rifat");
        names("hlw", "hello");
    }

}
