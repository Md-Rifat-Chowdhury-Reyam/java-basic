package Operator.Ternary;

public class TernaryCondition {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int res = (a > b) ? (a + b) : (a - b);

        System.out.println(res);

        int max = (a > b) ? a : b;
        System.out.println(max);
    }
}
