package String.Intro;

public class JVMMemory {
    public static void main(String[] args) {

        //Literal String
        // reference variable store in stack but if same of object the common object will store in heap
        String s1 = "Tax";
        String s2 = "Tax";


        //new keyword string
        // reference variable store in stack but object store in heap in different no common

        String s3 = "Tax";
        String s4 = "Tax";

        //construct string from subset of char array

        byte[] arrayAscii = {82, 73, 70, 65, 84};

        String stg = new String(arrayAscii);
        System.out.println(stg);

        //call the index
        String stCall = new String(arrayAscii, 1, 2);
        System.out.println(stCall);
    }
}
