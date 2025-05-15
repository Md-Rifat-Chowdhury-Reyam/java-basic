package String.StringBuffer;

public class BufferMethods {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        //append()
        sb.append("hello");
        sb.append(" java");
        String str = sb.toString();
        System.out.println(str);

        //insert()
        sb.insert(1, "Rifat");
        System.out.println(sb);

        //replace()
        sb.replace(1, 3, "Hi");
        System.out.println(sb);

         //delete()
        sb.delete(1,2);
        System.out.println(sb);

        //reverse()
        sb.reverse();
        System.out.println(sb);

        //capacity()
        //default capacity() --> 16
        //increase capacity() --> (old capacity *2 ) + 2 = 34
        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.capacity()); //default capacity

        sb.append("I am 32 ");
        System.out.println(sb.capacity());  //increase capacity() --> (old capacity * 2 ) + 2 = 34

        sb.append("java i am learning you");
        System.out.println(sb.capacity());  //increase capacity() --> ( 34 * 2 ) + 2 = 70

    }
}
