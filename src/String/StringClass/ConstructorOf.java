package String.StringClass;

import java.nio.charset.Charset;

public class ConstructorOf {

    static byte[] bt = {82, 73, 70, 65, 84};
    static int[] intArr = {82, 73, 70, 65, 84};
    static char[] ch = {'R', 'I', 'F', 'A', 'T'};
    static Charset cs = Charset.defaultCharset();
    static StringBuffer sb =    new StringBuffer("Rifat");
    static StringBuilder sBD = new StringBuilder("Rifat");

    public static void main(String[] args) {

        String s11 = new String(bt);//Construct a new String by decoding the byte array. It uses the platform's default character set for decoding.
        System.out.println(s11);

        String s12 = new String(bt,cs);
        System.out.println(s12);

        String s13 = new String(bt, 1, 3);
        System.out.println(s13);

        String s14 = new String(bt, 1, 4, cs);
        //Alternative
//        String s141 = new String (bt, 1, 4, Charset.forName("US-ASCII"));
        System.out.println("s14 : " + s14);

        String s2 = new String(intArr, 1, 4);//Allocates a String from a uni_code_array but choose count characters from the start_index.
        System.out.println(s2);

        String s3 = new String(ch, 2, 3);//Allocates a String from a given character array but choose count characters from the start_index.
        System.out.println(s3);

        String s4 = new String (sb);
        System.out.println(s4);

        String s5 = new String (sBD);
        System.out.println(s5);



    }

}
