package String.StringBuilder;

public class Append {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Md. ");
        sb.append("Rifat ");
        System.out.println(sb);
        System.out.println(sb.toString()); //convert to String and print

        StringBuilder sb1 = new StringBuilder("I am "); // initialize string builder
        sb1.append("Rifat");
        System.out.println(sb1);
    }
}
