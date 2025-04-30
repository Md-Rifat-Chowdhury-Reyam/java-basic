package DataType;

public class InterfaceData {
    public static void main(String[] args) {
        UniAIUB aiub = new UniAIUB();
        aiub.rules();

    }
}

interface UGC
{
    void rules(); //method by default abstract and hasn't body;
}

class UniAIUB implements UGC
{
    public void rules()
    {
        System.out.println("AIUB maintaining ugc rules");
    }

}
