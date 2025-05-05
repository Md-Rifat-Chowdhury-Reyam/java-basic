package TypeCasting;

public class NarrowCasting {

    public static void main(String[] args) {
        int a = 5;

        //casting to large;
        double db = (double) a;
        System.out.println(db);


        //narrow casting;
        int a1 =(int)db;
        System.out.println(a1);
    }
}
