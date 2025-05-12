package Methods.Varargs;

public class VarargsWithOtherArguments {

    static void methods(String s, int... a)
    {
        System.out.println("String is : " + s);

        System.out.println("The number of arguments : " + a.length);
        for (int i : a)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        methods("Rifat", 1,2,3,4);
    }

}
