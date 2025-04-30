package DataType;

public class _class {

    String conferName;
    int year;

    _class(String con, int yr)
    {
        this.conferName = con;
        this.year = yr;

    }

    public void display()
    {
        System.out.println("Conference " + conferName + " year " + year );
    }

    public static void main(String[] args) {
        _class c = new _class("G20", 2025);
        c.display();
    }

}
