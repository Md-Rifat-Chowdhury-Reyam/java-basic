package String.Intro;

public class ReverseString {
    public static void main(String[] args) {
        
        String st = "Rifat";
        String stR = "";
        
        for(int i = st.length() -1 ; i >= 0; i--)
        {
            char ch = st.charAt(i);
            String stCh = Character.toString(ch);

            System.out.print(stCh + " ");
        }
        System.out.println();
        System.out.println(st);
    }
}
