package String.StringClass;

public class MethodsOf {
    public static void main(String[] args) {

        String name = "Rifat Chowdhury";

        //Methods:
        //.length()
        System.out.println(name.length()); //return total number of characters in String

        //.charAt()
        System.out.println(name.charAt(2)); // return the "i"th number of character

        //.subString()
        System.out.println(name.substring(3));
        System.out.println(name.substring(2, 4));// Returns the substring from i to j-1 index

        //.indexOf()
        System.out.println(name.indexOf("Chowdhury"));
        System.out.println(name.indexOf('f', 1));

        //.equals()
        boolean equalCheck = "Rifat".equals("rifat");
        System.out.println(equalCheck);

        equalCheck = "Md".equals("Md");
        System.out.println(equalCheck);

        //.equalIgnoreCase()
        equalCheck = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + equalCheck);

        //.compareTo()
        String s1 = "Rifat";
        String s2 = "Reyam";
        int whereC = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is = " + whereC);

        //.toLowerCase()

        System.out.println(s1.toLowerCase());

        //.toUpperCase()
        System.out.println(s2.toUpperCase());

        //.trim()
        // remove the white space start and end of the string's
        //Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
        String sName =" Rifat ";
        int i = 0;
        System.out.println(sName.trim() + i);

        //.replace()
        String Rifat = "sifat".replace('s', 'R');
        System.out.println(Rifat);








    }
}
