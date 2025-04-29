package DataType;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class $roundingOffError {
    public static void main(String[] args) {

        double a = 0.7;
        double b = 0.9;
        double x = a + 0.1;
        double y = b - 0.1;

        System.out.println(x);
        System.out.println(y );

        double a1 = 1.0;
        double b1 = 0.10;

        double mul = 9 * b1;
        System.out.println(mul);

        a1 = a1 - mul;
        System.out.println(a1); // rounding off error;

        //solution with BigDecimal class

        BigDecimal a2 = new BigDecimal(1.0);
        BigDecimal b2 = new BigDecimal(0.10);


        BigDecimal mul1 = b2.multiply(new BigDecimal(9));

        a2 = a2.subtract(mul1);

        a2 = a2.setScale(2, RoundingMode.HALF_UP);
        System.out.println(a2);

    }
}
