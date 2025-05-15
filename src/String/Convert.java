package String;

public class Convert {
    public static void main(String[] args) {

        //String to StringBuffer
        String str = "Rifat";

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb);


        //String to StringBuilder
        String str1 = "chowdhury";

        StringBuilder sbd = new StringBuilder(str1);
        System.out.println(sbd);


        //StringBuffer to String
        StringBuffer sb1 = new StringBuffer("hello");

        String str2 = sb1.toString();
        System.out.println(str2);

        //StringBuilder to String
        StringBuilder sbd1 = new StringBuilder("Java");
        String str3 = sbd1.toString();
        System.out.println(str3);

    }
}
