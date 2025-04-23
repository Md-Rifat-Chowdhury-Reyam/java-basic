package Identifier;

public class strictFlotingPoint {

    public strictfp double sum()
    {
        double a = 10e+10;
        double b = 8e5;
        return (a + b);


    }

    public static void main(String[] args) {
        strictFlotingPoint sfp = new strictFlotingPoint();
        System.out.println(sfp.sum());
    }
}
