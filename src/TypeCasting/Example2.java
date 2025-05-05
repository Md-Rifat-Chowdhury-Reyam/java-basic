package TypeCasting;

public class Example2 {

    public static void main(String[] args) {
        Member m = new Admin(); //Upcasting access only general property of superclass

        m.name = "Rifat";
        m.phnNum = 1747810390;

        m.chatWhat();

        //down casting
        Admin a = (Admin) m;
        a.userAdd(); //Downcast to access specific property of subclass

    }
}

class Member
{
    String name;
    long phnNum;

    void chatWhat()
    {
        System.out.println( name + " chatting in whatsapp group");
    }

}
class Admin extends Member
{
    void userAdd()
    {
        System.out.println(name + " added new user in whatsapp group");
    }

}