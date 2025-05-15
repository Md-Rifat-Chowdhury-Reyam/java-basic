package String.Intro;

public class Concatanation {

    public static void main(String[] args) {

        //immutable
        String st = "Md. ";
        st.concat("Rifat");
        System.out.println(st);


        //mutable with concat() method
        String str = "Rifat";
        str = str.concat(" Chowdhury");

        System.out.println(str);


        //Alternative
        String s1 = "Md ";
        String s2 = "Rifat ";
        System.out.println(s1.concat(s2));


        //Handling NullPointerException in String concat()

        try {
            String stri = "Hi ";
            String Stri2 = null;

            String Stri3 = stri.concat(Stri2);
            System.out.println(Stri3);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
