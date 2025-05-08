package TypeCasting;

public class NarrowCasting {

    public static void main(String[] args) {
        int a = 5;

        //casting to large;
        double db = (double) a; //here first bracket is cast operator
        System.out.println("casting to large : " + db);


        //narrow casting;
        int a1 =(int)db;
        System.out.println("Narrow casting : " + a1);


        long a2 = 3;
        byte b2 = 2;
        double c2 = 2.0;

        //  int sum = a2 + b2 + c2;  compile time error
        double sum = a2 + b2 + c2;
        System.out.println(sum);

        var number = 9786;
        System.out.println(number);



    }
}
