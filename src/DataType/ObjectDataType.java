package DataType;

public class ObjectDataType {

    String  progName;
    int rankGlobal;

    public void Info(String Pname, int rG)
    {
        this.progName = Pname;
        this.rankGlobal = rG;

    }
    public void display()
    {
        System.out.println("Programming name :" + progName);
        System.out.println("Rank in global : "+ rankGlobal);
    }

    public static void main(String[] args) {
        ObjectDataType ob = new ObjectDataType();

        ob.Info("java", 2);
        ob.display();
    }

}
